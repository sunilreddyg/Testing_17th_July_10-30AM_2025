package com.bq.webdriver.GetLocator;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class GetObject_Height_And_Width {

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
	
	
	By Category=By.xpath("//strong[.='Categories']");
	//@Test
	void Object_Height_And_WIdth() 
	{
		driver.get("https://demowebshop.tricentis.com/");
		//Read object height and width
		int ObjHeight=driver.findElement(Category).getSize().getHeight();
		int Objwidth=driver.findElement(Category).getSize().getWidth();
		System.out.println("Object Height is --> "+ObjHeight);
		System.out.println("Object Width is ---> "+Objwidth);
	}
	
	@Test
	void Object_rect() 
	{
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.findElement(Category).getRect().getX());
		System.out.println(driver.findElement(Category).getRect().getY());
		System.out.println(driver.findElement(Category).getRect().getHeight());
		System.out.println(driver.findElement(Category).getRect().getWidth());
		
	}

}
