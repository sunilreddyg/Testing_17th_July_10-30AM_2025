package com.bq.webdriver.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript_ScrollIntoView {

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Location=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		
		//selenium 4 have direct method to scroll to object
		//new Actions(driver).scrollToElement(Location).perform();
		
		//Get Javascript executor at automatio browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
	    js.executeScript("arguments[0].scrollIntoView(true)", Location);
		
		/*
		 * Note:--> It will bring your requried object
		 * 			to viewport.By defult your object presented
		 * 			at down side of the page
		 * 
		 * 		scrollIntoView(true):-->   
		 * 		true - the top of the element will be aligned to 
		 *      the top of the visible area of the scrollable ancestor
		 *      
		 *		scrollIntoView(false):-->
		 *		false - the bottom of the element will be 
		 *		aligned to the bottom of the visible area 
		 *		of the scrollable ancestor.		
		 */

	}

}
