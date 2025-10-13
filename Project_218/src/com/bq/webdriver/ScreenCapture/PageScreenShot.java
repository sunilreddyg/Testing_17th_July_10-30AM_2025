package com.bq.webdriver.ScreenCapture;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class PageScreenShot 
{

	public static void main(String[] args) throws Exception {
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/free-job-alerts");
		Thread.sleep(5000);
		
		//Taking Screenshot converting to file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Creating Folder under project
		FileHandler.createDir(new File("screens"));
		
		//Copy Screenshort file into location folder
		FileHandler.copy(src, new File("screens//image1.png"));
		
		/*
		 * .PNG:--> Portal network graphic
		 * 			[It is a image extension]
		 */
	}

}
