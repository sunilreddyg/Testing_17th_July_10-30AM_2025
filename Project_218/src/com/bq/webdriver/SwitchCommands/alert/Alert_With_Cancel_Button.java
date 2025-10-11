package com.bq.webdriver.SwitchCommands.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_Cancel_Button {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    WebElement Cancel_link=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	    Cancel_link.click();   //This command open Confirm alert page
	    Thread.sleep(3000);
	    
	    WebElement Confirm_box_link=driver.findElement(By.xpath("//button[contains(.,'click the button to display a confirm box')]"));
	    Confirm_box_link.click();  //This action will bring confirmation alert
	    Thread.sleep(3000);
	    
	    
	    //Read Text at alert window
	    String alert_text=driver.switchTo().alert().getText();
	    System.out.println(alert_text);
	    
	    //Click on CanCel Tab at alert window
	    driver.switchTo().alert().dismiss();
	    System.out.println("Clicked at cancel tab");
	    

	}

}
