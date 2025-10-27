package com.bq.ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Log_Status {

	public static void main(String[] args) {
		
		
		//Create html file
				String filepath="Ext_reports/report5.html";
				ExtentReports reporter=new ExtentReports(filepath, true);

				//Create Test
				ExtentTest test=reporter.startTest("Login_valid");
				
					test.log(LogStatus.PASS,"Testpassed");
					test.log(LogStatus.FAIL,"Test failed");
					test.log(LogStatus.FATAL,"Test major failure");
					test.log(LogStatus.INFO,"Test Info");
					test.log(LogStatus.SKIP,"Test Skipped");
					test.log(LogStatus.WARNING,"Test Warking");
					
					
					try {
						
						 int a = 30, b = 0;
				         int c = a/b;  // cannot divide by zero //ErroCode
				         System.out.println ("Result = " + c);
				         
				         
					} catch (ArithmeticException e) {
						e.printStackTrace();
						test.log(LogStatus.FAIL, e);
					}
			         
					
					
				
				reporter.endTest(test);
				
				reporter.flush(); //Generate report

	}

}
