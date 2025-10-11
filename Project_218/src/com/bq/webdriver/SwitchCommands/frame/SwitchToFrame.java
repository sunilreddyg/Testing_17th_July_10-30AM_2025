package com.bq.webdriver.SwitchCommands.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://demo.automationtesting.in/Frames.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //Switch to frame using frame id
	    driver.switchTo().frame("singleframe");
	    
	    
	    WebElement InputBox=driver.findElement(By.cssSelector("input[type='text']"));
	    InputBox.sendKeys("Hello");
	    
	    //Get Control back to main page
	    driver.switchTo().defaultContent();
	    
	    //Printing title of the page
	    System.out.println(driver.getTitle());
	    

	}

}
