package com.bq.webdriver.ScreenCapture;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShotUsing_TimeStampts {

	public static void main(String[] args) throws Exception 
	{
	 	// Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the target URL
        driver.get("https://amazon.in");
        Thread.sleep(3000);
        
        //Capture Current System Date
        Date d=new Date();
        //Create object for Date formatter class
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        //COnvert date using date formatter
        String time=df.format(d);
		
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("screens\\home"+time+".png"));
        

	}

}
