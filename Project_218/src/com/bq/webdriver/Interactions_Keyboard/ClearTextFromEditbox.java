package com.bq.webdriver.Interactions_Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearTextFromEditbox {

	public static void main(String[] args) {
		
		
		String url="https://www.naukri.com/";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		
		WebElement Loc=driver.findElement(By.xpath("//input[@placeholder='Enter location']"));
		Loc.sendKeys("HYDERABAD");
		
		//Creating object for actions class
		Actions action=new Actions(driver);

		action
		.click(Loc)
		.keyDown(Keys.CONTROL)
		.sendKeys("A")
		.pause(2000)
		.sendKeys(Keys.BACK_SPACE)
		.pause(2000)
		.perform();
		
		
	}

}
