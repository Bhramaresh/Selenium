package com.Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	
	int counter = 0;
	int retry = 3;
	
	public boolean retry(ITestResult result) {
		if(counter<3) {
			counter++;
			return true;
		}
		
		return false;
		
	} 

}
