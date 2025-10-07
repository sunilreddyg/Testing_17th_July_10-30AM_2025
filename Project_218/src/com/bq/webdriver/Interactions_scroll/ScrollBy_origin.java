package com.bq.webdriver.Interactions_scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class ScrollBy_origin {

	public static void main(String[] args) {
		
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
		  
	    WebElement BackToTop=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));

		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(BackToTop);
		new Actions(driver).scrollFromOrigin(scrollOrigin, 0, 100).perform();
		   
		   /*
		    * ScrollFromOrigin:-->
		    * 		This method is effective combination of below two methods
		    * 			ScrollToelement
		    * 			ScrollByAmmount
		    * 
		    * 
		    * If the element is out of the viewport, it will be scrolled to the bottom of the screen,
		    *  then the page will be scrolled by the provided delta x and delta y values.
		    *  
		    *  
		    */

	}

}
