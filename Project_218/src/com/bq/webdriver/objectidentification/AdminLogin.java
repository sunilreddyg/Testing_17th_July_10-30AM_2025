package com.bq.webdriver.objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.net/admin/login");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		driver.findElement(By.id("submit")).click();
		
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']")).click();
		
	}

}
