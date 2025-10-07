package com.bq.webdriver.Interactions_Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-practice.netlify.app/double-click");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		WebElement Element=driver.findElement(By.xpath("//button[@type='submit']"));
		new Actions(driver).doubleClick(Element).perform();
		
		

	}

}
