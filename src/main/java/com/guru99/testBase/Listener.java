package com.guru99.testBase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.guru99.utils.CommonMethods;



public class Listener implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		System.out.println("my test case got started");
		
	}

	
	public void onTestSuccess(ITestResult result) {
	CommonMethods.takescreenshort("passed/"+result.getName());
		
	}

	
	public void onTestFailure(ITestResult result) {
		CommonMethods.takescreenshort("failed/"+result.getName());
		
	}

	
	public void onTestSkipped(ITestResult result) {
	
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onStart(ITestContext context) {
		
		
	}

	
	public void onFinish(ITestContext context) {
		
		
	}
	

}
