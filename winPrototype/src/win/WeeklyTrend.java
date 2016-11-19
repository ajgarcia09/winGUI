package win;
import java.util.*;
/**
 * A child of Trend, used to keep track 
 * of the user's weekly sleep and 
 * exercise trends
 * @author Ana J. Garcia
 * @version 1.0 (11/17/2016)
 * @see Trend
 *
 */
public class WeeklyTrend extends Trend{
	

	public WeeklyTrend(int accountID, int sleepTime, int workoutTime, int numSteps, String month) {
		super(accountID, sleepTime, workoutTime, numSteps, month);
		
	}
	
	

}
