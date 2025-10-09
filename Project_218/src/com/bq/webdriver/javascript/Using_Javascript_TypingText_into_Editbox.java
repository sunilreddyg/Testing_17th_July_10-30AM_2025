package com.bq.webdriver.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_Javascript_TypingText_into_Editbox {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Using Selenium Method Type text into editbox
		//driver.findElement(By.id("email")).sendKeys("Darshan");
		
		//Using Keybord Interactions class typing text into Editbox
		WebElement Password=driver.findElement(By.id("pass"));
		new Actions(driver).sendKeys(Password, "Admin").perform();
		
		//Get Javascript exeucutor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type text into Editbox using javascript
		js.executeScript("document.getElementById('email').value='Darshan1'");

		//Click method on button
		WebElement LoginBtn=driver.findElement(By.cssSelector("button[name='login']"));
		js.executeScript("arguments[0].click()", LoginBtn);
		
	}

}
