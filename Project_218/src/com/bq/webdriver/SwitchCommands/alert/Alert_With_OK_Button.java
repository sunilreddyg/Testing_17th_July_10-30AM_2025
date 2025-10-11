package com.bq.webdriver.SwitchCommands.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_OK_Button {

	public static void main(String[] args) throws Exception {
		
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://tgepass.cgg.gov.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //This button make alert display at webpage
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@value='Login']"));
	    Alert_prompt_link.click();
	    //Thread.sleep(5000);
	    
	    
	    //Switch to alert window and read text from alert
	    String alerttext=driver.switchTo().alert().getText();
	    System.out.println(alerttext);
	    Thread.sleep(5000);
	    
	    
	    //Close alert  [It press Ok button at alert ]
	    driver.switchTo().alert().accept();
	    
	    
	   
	    

	}

}
