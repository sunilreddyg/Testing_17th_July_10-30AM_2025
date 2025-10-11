package com.bq.webdriver.SwitchCommands.window;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNextWindow {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //Capturing Main window
	    String MainWindow=driver.getWindowHandle();
	    
	    
	    //Click on Threads link [Link OPens in New Tab]
	    driver.findElement(By.linkText("Threads")).click();
	    Thread.sleep(2000);
	    
	    //Get All WIndow IDS
	    Set<String> AllWindowIDs=driver.getWindowHandles();
	    
	    //Iterate upto number of windows available
	    for (String EachwindowId : AllWindowIDs) 
	    {
			driver.switchTo().window(EachwindowId);
		}
	    
	    
	    //Sub window title is
	    System.out.println(driver.getTitle());
	    
	    
	    //Switch Back to mainwindow
	    driver.switchTo().window(MainWindow);
	    System.out.println(driver.getTitle());
	}

}
