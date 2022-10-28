package com.Analyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryPractice {
	
	
	
	@Test(retryAnalyzer = com.Analyzer.RetryAnalyzer.class)
	public void TestOne() {
		Assert.assertEquals(false, true);
	}
	
	@Test(retryAnalyzer = com.Analyzer.RetryAnalyzer.class)
	public void TestTwo() {
		Assert.assertEquals(true, true);
	}
	

}
