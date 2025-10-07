package com.bq.webdriver.Interactions_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_On_ZoomICon {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/zoom/image-magnifier-on-hover.html");
		driver.manage().window().maximize();
		
		
		//Performing hover action at location
		WebElement Image=driver.findElement(By.xpath("/html/body/div[3]/div[1]/section[1]/article[6]/figure/a"));
		new Actions(driver).moveToElement(Image).pause(2000).click().perform();
		
	}

}
