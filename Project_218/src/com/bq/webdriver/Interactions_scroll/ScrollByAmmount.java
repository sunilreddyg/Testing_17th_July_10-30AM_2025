package com.bq.webdriver.Interactions_scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmmount {

	public static void main(String[] args) throws Exception {
		
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	  
	   WebElement BackToTop=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
	   int ObjY=BackToTop.getRect().getY();  //Reading object y coordinates at webpage
	   
	   new Actions(driver).scrollByAmount(0, ObjY).perform();
	   //scrollByAmount:--> Scroll page until object get to view port.But your required object
	   //will be presented top side of webpage
	   
	   
	   /*
	    * deltax :--> Scroll your page left to right
	    * delaty ;--> Scroll your page from top to bottom
	    * 	Note:--> Use negative values to do opposite
	    */
	   
	   
	   //Scroll Object left to right
	   new Actions(driver).scrollByAmount(200, 0).perform();

	   Thread.sleep(3000);
	   //Scroll Object right to left
	   new Actions(driver).scrollByAmount(-100, 0).perform();
	}

}
