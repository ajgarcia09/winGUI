package win;
/**
 * A child of Trend, used to keep track 
 * of the user's monthly sleep and 
 * exercise trends
 * @author Ana J. Garcia
 * @version 1.0 (11/17/2016)
 * @see Trend
 *
 */
public class MonthlyTrend extends Trend{
	private boolean isNewMonth;

	public MonthlyTrend(int accountID, int sleepTime, int workoutTime, int numSteps, String month) {
		super(accountID, sleepTime, workoutTime, numSteps, month);
	}
	/**
	 * 
	 * @return isNewMonth - a boolean that determines 
	 * whether data for a new month is being entered
	 */
	public boolean getIsNewMonth(){
		return isNewMonth;
	}
	
	/**
	 * 
	 * @param isNewMonth a boolean that determines 
	 * whether data for a new month is being entered
	 */
	public void setIsNewMonth(boolean isNewMonth){
		this.isNewMonth = isNewMonth;
	}

}
