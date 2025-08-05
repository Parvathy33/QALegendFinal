package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnalyser implements IRetryAnalyzer {

	private int initialRetryCount = 0;
	private static final int maximumRetryCount = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(initialRetryCount<maximumRetryCount)
		{
			initialRetryCount++;
			return true;
		}
		
		return false;
	}

	
}
