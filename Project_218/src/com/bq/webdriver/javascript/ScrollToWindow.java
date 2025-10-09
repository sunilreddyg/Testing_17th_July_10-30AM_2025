package com.bq.webdriver.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToWindow {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);
		
		
		//Scroll the document to the vertical position 500
		js.executeScript("window.scrollTo(0, 500)");
		Thread.sleep(2000);
		
		
		//Scroll the document to the horizontal position 300
		js.executeScript("window.scrollTo(300, 0)");
		
		
		/*
		 * Note:--> It will bring your requried object
		 * 			to viewport.By defult your object presented
		 * 			at Top side of the browser window
		 * 
		 * 			Note:--> By adding negative values we can do opposite sides..
		 * 
		 * 			This feature available in selenium4 with name 
		 * 			ScrollByAmmount
		 */

	}

}
