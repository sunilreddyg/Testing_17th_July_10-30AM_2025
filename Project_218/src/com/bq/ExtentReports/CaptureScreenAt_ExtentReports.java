package com.bq.ExtentReports;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CaptureScreenAt_ExtentReports {

	public static void main(String[] args) throws IOException {
		
		//Create html file
		String filepath="Ext_reports/report6.html";
		ExtentReports reporter=new ExtentReports(filepath, true);

		//Create Test
		ExtentTest test=reporter.startTest("Login_valid");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		//Capture Screen
		String filescreen="MyScreens\\Webshop.png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(filescreen));
		
		test.log(LogStatus.INFO, test.addScreenCapture(filescreen),"HomeScreen Captured");
		
		reporter.endTest(test);
		
		reporter.flush(); //Generate report
		
		
	}

}
