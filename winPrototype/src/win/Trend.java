package win;
/**Stores Activity Tracking System users' data
 * (such as sleep and exercise) in daily, 
 * weekly, and monthly views. 
 * @author Ana J. Garcia
 * @version 1.0 (11/14/2016)
 * @see DailyTrend
 * @see WeeklyTrend
 * @see MonthlyTrend
 *
 */
public class Trend {
	private int accountID;
	private int sleepTime;
	private int workoutTime;
	private int numSteps;
	private String month;
	
	public Trend(int accountID, int sleepTime, int workoutTime, int numSteps, String month) {
		this.accountID = accountID;
		this.sleepTime = sleepTime;
		this.workoutTime = workoutTime;
		this.numSteps = numSteps;
		this.month = month;
	}

	/**
	 * 
	 * @return accountID - the user's account number
	 */
	public int getAccountID() {
		return accountID;
	}

	/**
	 * 
	 * @return sleepTime - the user's total sleep time 
	 */
	public int getSleepTime() {
		return sleepTime;
	}

	/** 
	 * 
	 * @return workoutTime - the user's total workout time
	 */
	public int getWorkoutTime() {
		return workoutTime;
	}

	/**
	 * 
	 * @return numSteps - the user's total number of steps taken
	 */
	public int getNumSteps() {
		return numSteps;
	}

	/**
	 * 
	 * @return month - the month in which
	 * the current activity is being logged into
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * 
	 * @param accountID - the user's unique 
	 * account number which is used to link
	 * the user to his or her Activities
	 */
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	/**
	 * 
	 * @param sleepTime - the user's total 
	 * sleep time
	 */
	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}

/**
 * 	
 * @param workoutTime the user's total 
 * workout time
 */
	public void setWorkoutTime(int workoutTime) {
		this.workoutTime = workoutTime;
	}

	/**
	 * 
	 * @param numSteps the user's total
	 * number of steps taken
		 */
	public void setNumSteps(int numSteps) {
		this.numSteps = numSteps;
	}

}
