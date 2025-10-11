package com.bq.webdriver.SwitchCommands.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexFrame {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://support.orangehrm.com/portal/en/signin");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //Switch to frame using index number
	    driver.switchTo().frame(0);
	    
	    
	    WebElement Email=driver.findElement(By.xpath("//input[@id='login_id']"));
	    Email.sendKeys("info@bridgeqsystems.com");
	    
	    WebElement NextBtn=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
	    NextBtn.click();
	    
	    //Get Control back to page
	    driver.switchTo().defaultContent();
	}

}
