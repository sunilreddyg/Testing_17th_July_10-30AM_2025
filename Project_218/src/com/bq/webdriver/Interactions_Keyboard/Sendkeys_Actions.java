package com.bq.webdriver.Interactions_Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Actions {

	public static void main(String[] args) {
		
		
		String url="https://www.naukri.com/";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   

		WebElement Exp=driver.findElement(By.id("expereinceDD"));
		
		//Create object for Actions class
		Actions action=new Actions(driver);
		
		action
		.click(Exp)
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(2000)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		
		
		
		
	}

}
