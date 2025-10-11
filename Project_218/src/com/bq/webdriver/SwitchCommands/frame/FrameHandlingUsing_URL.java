package com.bq.webdriver.SwitchCommands.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingUsing_URL {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://support.orangehrm.com/portal/en/signin");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //Navigating to frame [Only Selected Frame opens]
	    driver.navigate().to("https://support.orangehrm.com/accounts/p/10016470839/signin?");
	    
	    WebElement Email=driver.findElement(By.xpath("//input[@id='login_id']"));
	    Email.sendKeys("info@bridgeqsystems.com");
	    
	    
	    //Navigate back to previous window
	    driver.navigate().back();

	}

}
