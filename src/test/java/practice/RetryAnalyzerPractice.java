package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {
	@Test(retryAnalyzer = ninzaCRM.genericUtlities.RetryAnalyserImplementation.class)
	public void sample() {
		Assert.fail();
		System.out.println("sample");
	}

}
