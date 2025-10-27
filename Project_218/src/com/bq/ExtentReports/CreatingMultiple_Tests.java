package com.bq.ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreatingMultiple_Tests {

	public static void main(String[] args) {
		
		//Create html file
		String filepath="Ext_reports/report3.html";
		ExtentReports reporter=new ExtentReports(filepath, true);

			//Create Test
			ExtentTest test1=reporter.startTest("Login_valid");
			
				test1.log(LogStatus.PASS,"Login Valid test Verified");
			
			reporter.endTest(test1);
			
			
			//Create Test
			ExtentTest test2=reporter.startTest("Login_Invalid");
			
				test2.log(LogStatus.FAIL,"Login Invalid test failed");
			
			reporter.endTest(test2);
			
			//Create Test
			ExtentTest test3=reporter.startTest("Login_Blank");
			
				test3.log(LogStatus.SKIP,"Login blank test skipped");
			
			reporter.endTest(test3);
		
		reporter.flush(); //Generate report

	}

}
