package com.bq.webdriver.SwitchCommands.ActiveELement;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Active_Element {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//Target Active element at webpage
		driver.switchTo().activeElement().sendKeys("Admin");
	

	}

}
