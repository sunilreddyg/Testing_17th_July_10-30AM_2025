package com.bq.webdriver.ImplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_Test 
{
	
	public static void main(String[] args) throws Exception
	{
		
		//Browser UP and loading webpage
				String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
				WebDriver driver=new ChromeDriver();
				driver.get(URL);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
			
				
				
				//Identifying objects using xpath 
				//Login Entry
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();

				
				
						
				
				//Clicking on PIM at login page
				driver.findElement(By.xpath("(//span[contains(.,'PIM')])[1]")).click();
				
				
				//Click on add button
				driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
				
				
				
				//Enter FIrstname
				driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Suresh4");
				//Enter Middle name
				driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Kumar5");
				//Enter Lastname
				driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kaikala1");
			
				//ENter employee ID
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("16");
				
				
				//Click on save button
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				
				//Selecting gender
				driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")).click();
				
				//Click on Save button
				driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
				
				
				//Wait and CLose browser
				Thread.sleep(10000);
				driver.quit();
		
	}

}
