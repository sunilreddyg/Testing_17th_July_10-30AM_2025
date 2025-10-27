package com.bq.ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateTest_At_ExtentReports {

	public static void main(String[] args) {
		
		//Create html file
		String filepath="Ext_reports/report2.html";
		ExtentReports reporter=new ExtentReports(filepath, true);

		//Create Test
		ExtentTest test=reporter.startTest("Login_valid");
		
			test.log(LogStatus.PASS,"Login Valid test Verified");
		
		reporter.endTest(test);
		
		reporter.flush(); //Generate report

	}

}
