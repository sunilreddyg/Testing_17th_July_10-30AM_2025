package com.bq.webdriver.SwitchCommands.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://demo.automationtesting.in/Frames.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    WebElement Tab=driver.findElement(By.xpath("//a[@href='#Multiple']"));
	    Tab.click();
	    
	    //Switching to parent frame
	    WebElement PframeEle=driver.findElement(By.cssSelector("#Multiple > iframe"));
	    driver.switchTo().frame(PframeEle);
	    
	    //Switching to child frame
	    WebElement CframeEle=driver.findElement(By.cssSelector(".iframe-container > iframe"));
	    driver.switchTo().frame(CframeEle);
	    
	    
	    
	    //Identifying element under child frame
	    WebElement InputBox=driver.findElement(By.cssSelector("input[type='text']"));
	    InputBox.sendKeys("Hello");
	    
	    //Switch control back to parent frame
	    driver.switchTo().parentFrame();
	    
	    //Switch control back to page from parent frame
	    driver.switchTo().defaultContent();
	    
	}

}
