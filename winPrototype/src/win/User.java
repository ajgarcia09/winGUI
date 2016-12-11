package win;
import java.util.*;

/**Represents a user of the Activity Tracking System.
 * Each user has various fields and methods for
 * storing and computing sleep and workout data 
 * @author Ana J. Garcia
 * @version 1.0 (11/14/2016)
 * @see ActivityLogger
 * @see Trend
 *
 */

public class User {
	private int accountID;
	private String name;
	private String gender;
	private int age;
	private int height;
	private int weight;
	private int bmi; 
	private static int numDayTrends;
	private static int numWeekTrends;
	private static int numDaySleep;
	private static int numDayWorkout;
	private static int numDaySteps;
	private static int numWeekSleep;
	private static int numWeekWorkouts;
	private static int numWeekSteps;
	private ActivityLogger activityLogger = new ActivityLogger(accountID);
	private HashSet<Activity> activities = new HashSet<Activity>();
	private HashSet<DailyTrend> dailyTrends = new HashSet<DailyTrend>();
	private WeeklyTrend weeklyTrends = WeeklyTrend.getUser();
	Calendar calendar = Calendar.getInstance();
	int day = calendar.get(Calendar.DAY_OF_WEEK);
	int dayCounter = 0;
	public static final String[] daysOfTheWeek = { "Sunday", "Monday" , "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	
	public User(int accountID, String name, String gender) {
		this.accountID = accountID;
		this.name = name;
		this.gender =gender;
		
	}
	
/**
 * @return name the user's name
 */
	public String getName() {
		return name;
	}
	
	public String getGender(){
		return gender;
	}
	

		
	/**
	 * @return age the user's age
	 */
	public int getAge(){
		return age;
	}

	/**
	 * @return height the user's height
	 */
	public int getHeight(){
		return height;
	}
	/**
	 * @return weight the user's weight
	 */
	public int getWeight(){
		return weight;
	}
	
/**
 * 
 * @param name the user's name
 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}


/**
 * 
 * @param age the user's age
 */
	public void setAge(int age) {
		this.age = age;
	}
/**
 * 
 * @param height the user's height
 */
	public void setHeight(int height) {
		this.height = height;
	}
/**
 * 
 * @param weight the user's weight
 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	/**Creates a new object of type Activity and adds
	 * it to the user's set of activities
	 * @see User#activityLogger
	 * @see User#activities
	 * @see ActivityLogger
	 */
//	public void logActivity(){
//		//System.out.println("now in user.logActivity");
//		Activity a1 = this.activityLogger.logActivity();
//		addActivity(a1);
//	}
	
//	public void logWorkout(){
//		//System.out.println("now in user.logActivity");
//		Activity a1 = this.activityLogger.logWorkout();
//		addActivity(a1);
//	}
	

	/**Adds an activity to the user's set of activities
	 * 
	 * @param a1 an object of type Activity
	 * @see User#activities 
	 */
	public void addActivity(Activity a1){
		activities.add(a1);
	}

	
	/**Print the user's logged activities
	 * by traversing its HashSet of type Activity
	 * @see User#activities
	 */
	public void printActivities(){
		System.out.println("User's logged activites: ");
		for(Iterator it = activities.iterator(); it.hasNext();){
			Activity activity = (Activity)it.next();
			activity.printActivityType(activity);
			//for debugging using the frames
			System.out.println(activity.getDuration());
			
		}
	}
	
	/**Create a new Daily Trend by retrieving data
	 * from the user's set of logged activities, 
	 * increments the static field numDayTrends, and
	 * adds the new Daily Trend into the user's set
	 * of daily trends.
	 * 
	 * @return dayTrend a new object of type DailyTrend
	 * @see User#activities
	 * @see validateNumDayTrends()
	 * @see User#dailyTrends
	 * @see User#numDayTrends
	 * @see DailyTrend
	 */
	public DailyTrend newDailyTrend(){
		int daySleep = countDaySleepTime();
		int dayWorkout = countDayWorkoutTime();
		int daySteps = 10000; //10,000 steps, fixed value for now
		String month = "November";
		int date = 13;
		DailyTrend dayTrend = new DailyTrend(daySleep,dayWorkout,daySteps);
		validateNumDayTrends();
		dailyTrends.add(dayTrend);
		return dayTrend;
	}
	
	/**Print the user's set of DailyTrends
	 * @see User#dailyTrends
	 */
	
	public void printDailyTrends(){
		for(Iterator it = dailyTrends.iterator(); it.hasNext();){
			DailyTrend currentDayTrend = (DailyTrend)it.next();
			System.out.println("user: " + this.getName());
			System.out.println("sleepTime = " + currentDayTrend.getSleepTime());
			System.out.println("workoutTime = " + currentDayTrend.getWorkoutTime());
			System.out.println("numSteps = " + currentDayTrend.getNumSteps());
		}
	}	

	/**Checks how many DailyTrends the user has
	 * and increments the static field numDayTrends 
	 * if the number of daily trends is between 0 and 7.
	 * Once numDayTrends has reached 7, a new Weekly Trend 
	 * is created with data from the last 7 days, and 
	 * numDayTrends is reset to 0.
	 * 
	 * @see User#numDayTrends
	 * @see newWeeklyTrend()
	 */
	private void validateNumDayTrends() { //TODO add each 
		System.out.println("entered validateNumDayTrends");
		if(numDayTrends >= 0 && numDayTrends <7)
			numDayTrends++;
		else{
			//newWeeklyTrend();
			numWeekTrends++;
			numDayTrends=0;
		}
		System.out.println("numDayTrends = " + numDayTrends);
	}
	
	/**Adds the user's total sleep time within
	 * a given time frame by traversing the user's 
	 * set of Activities.
	 * @return daySleep the total amount of sleep the user had in a day
	 * @see User#activities
	 * @see Activity
	 */
	public int countDaySleepTime() {
		int daySleep =0;
		
		if(day != calendar.get(Calendar.DAY_OF_WEEK)){
			activities.clear();
			dayCounter++;
		}
		for(Iterator it = activities.iterator(); it.hasNext();){
			Activity currentActivity = (Activity)it.next();
			System.out.println(currentActivity.getClass().getTypeName());
			if(currentActivity.getClass().getTypeName().equals("Sleep"))
				daySleep += currentActivity.getDuration();	
			    }
		weeklyTrends.addSleepTime(daySleep);
		return daySleep;
	}
	
	/**Adds the user's total workout time within
	 * a given time frame by traversing the user's 
	 * set of Activities.
	 * @return dayWorkout the total amount of sleep the user had in a day
	 * @see User#activities
	 * @see Activity
	 */
	public int countDayWorkoutTime() {
		int dayWorkout =0;

		if(day != calendar.get(Calendar.DAY_OF_WEEK)){
			activities.clear();
			dayCounter++;
		}
		for(Iterator it = activities.iterator(); it.hasNext();){
			Activity currentActivity = (Activity)it.next();
			currentActivity.printActivityType(currentActivity);
			if(currentActivity.getClass().getSuperclass().getTypeName().equals("Workout")){
				dayWorkout += currentActivity.getDuration();

			}
		}
		weeklyTrends.addWeeklyWorkoutTime(dayWorkout);
		return dayWorkout;
	}
	
	/**Adds randomly generated steps
	 * @return steps the total amount of steps the user had in a day
	 * @see User#activities
	 * @see Activity
	 */
	public int countDaySteps(){
		if(day != calendar.get(Calendar.DAY_OF_WEEK)){
			activities.clear();
			dayCounter++;
		}
		Random generator = new Random();
		int steps= generator.nextInt();
		weeklyTrends.addSteps(steps);
		return steps;
	}
	
	public void logRun(int runDistance, int runDuration) {
		Activity a1 = this.activityLogger.logRun(runDistance, runDuration);
		addActivity(a1);
		
	}

	public void logSwim(int swimDuration, int numLaps, int numCycles) {
		Activity a1 = this.activityLogger.logSwim(swimDuration, numLaps, numCycles);
		addActivity(a1);
		
	}

	public void logSleep(boolean isNap, int sleepDuration) {
		Activity a1 = this.activityLogger.logSleep(isNap, sleepDuration);
		addActivity(a1);
		
	}
	// this is used to traverse and print the amount of activities done during the week 
	public void printWeekProgress(){
		DailyTrend[] week = weeklyTrends.getDailyProgress();
		for(int i = 0; i < week.length; i++){
			System.out.println("The amount of sleep on " + daysOfTheWeek[i] +" was: " + week[i].sleepTime + " Min");
			System.out.println("The amount of workout time on" + daysOfTheWeek[i] +" is: " + week[i].workoutTime + " Min");
			System.out.println("The amount of steps on" + daysOfTheWeek[i] +" is: " + week[i].steps + " Min");
		}
	}
	// this is used to traverse the array list of weeks to compare week progress
	public void printWeeklyProgress(){
		ArrayList<WeeklyTrend> weeks = weeklyTrends.getWeeklyProgress();
		int i = weeklyTrends.getCurrentWeek();
		int counter = 5;
		for(; counter >= 0; i--){
			System.out.println("The amount of sleep on week"+ i +" was: " + weeks.get(i).sleepTime + " Min");
			System.out.println("The amount of workout time on week" + i +" is: " + weeks.get(i).workoutTime + " Min");
			System.out.println("The amount of steps on week" + i +" is: " + weeks.get(i).steps + " Min");
			counter --;
		}
	}

}
