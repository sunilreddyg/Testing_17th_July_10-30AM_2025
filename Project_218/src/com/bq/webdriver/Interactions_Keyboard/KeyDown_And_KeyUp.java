package com.bq.webdriver.Interactions_Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_And_KeyUp {

	public static void main(String[] args) {
		
		String url="https://jqueryui.com/resources/demos/selectable/default.html";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		
		//Press Down Control Key
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		
		WebElement item1=driver.findElement(By.xpath("//li[contains(.,'Item 1')]"));
		WebElement item3=driver.findElement(By.xpath("//li[contains(.,'Item 3')]"));
		WebElement item5=driver.findElement(By.xpath("//li[contains(.,'Item 5')]"));
		WebElement item7=driver.findElement(By.xpath("//li[contains(.,'Item 7')]"));
		
		
		item1.click();
		item3.click();
		item5.click();
		item7.click();
		
		//Release Control Key
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		

	}

}
