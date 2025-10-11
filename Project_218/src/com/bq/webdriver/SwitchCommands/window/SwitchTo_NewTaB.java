package com.bq.webdriver.SwitchCommands.window;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_NewTaB {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //Get Main window ID
	    String InstawindowID=driver.getWindowHandle();
	    
		  WebDriver MetaAI= driver.switchTo().newWindow(WindowType.TAB);
		  MetaAI.get("https://www.meta.ai/?utm_source=foa_web_footer");
		  
		  //Get MetaAI window ID
		  String MetaWindowID=MetaAI.getWindowHandle();
		  
		  //Clicking link at meta ai window
		  MetaAI.findElement(By.partialLinkText("Log in")).click();
		  

		  
		  //Switch back to Mainwindow
		  MetaAI.switchTo().window(InstawindowID);
		  
		  //Get Mainwindow title
		  System.out.println(driver.getTitle());
		  
		  //Switch to MetaWindow
		  driver.switchTo().window(MetaWindowID);
		  
		  System.out.println(MetaAI.getTitle());
		  
	  
	}

}
