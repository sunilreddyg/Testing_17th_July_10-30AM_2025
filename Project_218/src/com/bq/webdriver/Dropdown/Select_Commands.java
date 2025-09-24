package com.bq.webdriver.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Commands {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//Selecting dropdow option using visible text
		new Select(driver.findElement(By.name("birthday_day")))
		.selectByVisibleText("18");
		
		//Selecting dropdown  option using value property
		new Select(driver.findElement(By.name("birthday_month")))
		.selectByValue("8");
		
		
		Thread.sleep(5000);
		//Selecting dropdown  option using Partial visible text...
		new Select(driver.findElement(By.name("birthday_month")))
		.selectByContainsVisibleText("De");
		
		//Selecting dropdown option using inded number
		new Select(driver.findElement(By.name("birthday_year")))
		.selectByIndex(25);
		
		
		

	}

}
