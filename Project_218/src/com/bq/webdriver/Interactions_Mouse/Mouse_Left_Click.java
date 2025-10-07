package com.bq.webdriver.Interactions_Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Left_Click 
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		WebElement ExpResume=driver.findElement(By.xpath("//div[@data-val='exp']"));
		//ExpResume.click();  //Perform Left Click action at selected object
		
		
		new Actions(driver).click(ExpResume).perform();
		
		
		/*
		 * WebElement Element=driver.findElement(By.id("ElementID"));
		 * 
		 *  => performing Left click using WebElement Command
		 * 	Element.Click();
		 * 
		 * 		Note:--> It provides error when element is 
		 * 					not at clickable position...
		 * 		
		 *  => Performing Left click usingReal mouse interaction...
		 *  new Actions(driver).Click(Element).Perform();
		 *  	
		 *  	Note:--> Don't get error when element is not
		 *  			at clickable position..
		 */
		
		
		
		
		
		
	}

}
