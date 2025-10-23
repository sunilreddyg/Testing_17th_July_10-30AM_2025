package com.bq.webdriver.GetCssValue;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.ClassOrderer.ClassName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

class Read_obj_Colors {

	
	static WebDriver driver;
	@BeforeAll //It invoke one before all tests invoke
	static void setUpBeforeClass() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterAll //it invoke once after all tests invoke
	static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	By obj_btn=By.xpath("//button[@data-testid='royal-login-button']");
	@Test
	void getBGColor() {
		
		driver.get("https://www.facebook.com/");
		String Bgcolor=driver.findElement(obj_btn)
		.getCssValue("background-color");
		System.out.println(Bgcolor);
		//By Default selnium read in RGBA format....
		
		String Exp_Color="#0866ff";
		
		//Selenium 4 have this feature
		//Convertng color into Required format...
		Color clr=Color.fromString(Exp_Color);
		String Exp_color_in_rgba=clr.asRgba();
		System.out.println(Exp_color_in_rgba);
		
		if(Bgcolor.equals(Exp_color_in_rgba))
			System.out.println("Color match found");
		else
			System.out.println("Color mismatched");
	}
	
	
	
	

}
