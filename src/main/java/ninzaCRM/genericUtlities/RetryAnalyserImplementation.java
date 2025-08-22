package ninzaCRM.genericUtlities;
import org.testng.IRetryAnalyzer;
/**
 * this class provides implementation to IRetryAnalyser
 */
import org.testng.ITestResult;

public class RetryAnalyserImplementation implements IRetryAnalyzer{
	int count =0, recount =3;
	public boolean retry (ITestResult result) {
		while (count <recount) {
			count++;
			return true;//retry count 
		}
		
		return false;//stop retry
	}

}
