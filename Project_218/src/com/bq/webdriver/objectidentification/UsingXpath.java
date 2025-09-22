package com.bq.webdriver.objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {

	public static void main(String[] args) throws Exception
	{

		//Browser UP and loading webpage
		String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		
		//Hold execution for 4 seconds
		Thread.sleep(2000);
		
		
		//Identifying objects using xpath 
		//Login Entry
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();

		
		//Hold execution for 2 seconds
		Thread.sleep(2000);
				
		
		//Clicking on PIM at login page
		driver.findElement(By.xpath("(//span[contains(.,'PIM')])[1]")).click();
		
		//Hold execution for 2 seconds
		Thread.sleep(2000);
		
		//Click on add button
		driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
		
		
		//Hold execution for 2 seconds
		Thread.sleep(2000);
		
		//Enter FIrstname
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Suresh3");
		//Enter Middle name
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Kumar4");
		//Enter Lastname
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kaikala1");
	
		//ENter employee ID
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("5");
		
		
		//Click on save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Hold 5 seconds
		Thread.sleep(5000);
		
		//Selecting gender
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")).click();
		
		//Click on Save button
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
		//Wait and CLose browser
		Thread.sleep(5000);
		driver.quit();
	}

}
