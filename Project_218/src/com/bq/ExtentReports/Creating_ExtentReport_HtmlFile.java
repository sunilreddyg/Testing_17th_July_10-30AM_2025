package com.bq.ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;

public class Creating_ExtentReport_HtmlFile {

	public static void main(String[] args) {
		
		String filepath="Ext_reports/report1.html";
		ExtentReports reporter=new ExtentReports(filepath, true);

		
		reporter.flush(); //Generate report
	}

}
