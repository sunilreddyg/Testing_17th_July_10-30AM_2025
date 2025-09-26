package com.bq.webdriver.ElementsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteTextbox {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	
		//Login Details
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();

		//Click on Admin
		WebElement admin=driver.findElement(By.xpath("(//span[contains(.,'Admin')])[1]"));
		admin.click();
		
		//Typing referral text into Entrybox
		WebElement SearchText=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		SearchText.sendKeys("Job");
		Thread.sleep(5000); //Wait for 5 seconds to load list of Users
		
		//Selecting one of user from list
		WebElement user1=driver.findElement(By.xpath("//span[contains(.,'Jobin Mathew Sam')]"));
		user1.click();
		
		
		
		
		
		
		
		
				
		

	}

}
