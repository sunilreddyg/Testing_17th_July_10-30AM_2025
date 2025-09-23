package com.bq.webdriver.Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) {
		
		//Browser UP and loading webpage
		String URL="https://login.yahoo.com/";
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		//Typing email and pressing enter key in Keyboard
		driver.findElement(By.xpath("//input[@id='login-username']"))
		.sendKeys("sunilreddy.gajjala@yahoomail.com",Keys.ENTER);
		

	}

}
