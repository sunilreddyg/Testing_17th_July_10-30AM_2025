package com.bq.webdriver.Interactions_Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy {

	public static void main(String[] args) throws Exception {
		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/jobs-in-india?clusters=experience&experience=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Get Element To view port..
		WebElement Src=driver.findElement(By.xpath("//div[@class='cir']"));
		new Actions(driver).scrollToElement(Src).perform();
		
		//Dragging element to Horizontal
		Thread.sleep(5000);
		new Actions(driver).dragAndDropBy(Src, 100, 0).perform();

	}

}
