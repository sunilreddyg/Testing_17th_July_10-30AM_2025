package com.bq.webdriver.GetLocator;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Get_Coordinates {

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
	void Read_XCoordinates() 
	{
		driver.get("https://demowebshop.tricentis.com/");
		int Obj_x=driver.findElement(Category).getLocation().getX();
		System.out.println("Object Located at X Coordinates are -->"+Obj_x);
	}
	
	//@Test
	void Read_YCoordinates() 
	{
		driver.get("https://demowebshop.tricentis.com/");
		int Obj_y=driver.findElement(Category).getLocation().getY();
		System.out.println("Object Located at X Coordinates are -->"+Obj_y);
	}
	
	
	@Test //Checking object presented at left side of the page
	public void checkingObjectCoorindates()
	{
		driver.get("https://demowebshop.tricentis.com/");
		int Obj_x=driver.findElement(Category).getLocation().getX();
		System.out.println("Object x Coordinates are --> "+Obj_x);
		
		
		int WindowWidth=driver.manage().window().getSize().getWidth();
		System.out.println("Toal window width is --> "+WindowWidth);
		
		//Condition accept when object x is less than 1/4 of the screen width
		if(Obj_x < WindowWidth/4)
			System.out.println("Object presented left side of the page");
		else
			System.out.println("Object presented right side of the page");
	}


	@Test //Checking object presented at left side of the page
	public void checkingObject_Y_Coorindates()
	{
		driver.get("https://demowebshop.tricentis.com/");
		int Obj_y=driver.findElement(Category).getLocation().getY();
		System.out.println("Object y Coordinates are --> "+Obj_y);
		
		
		int Windowheight=driver.manage().window().getSize().getHeight();
		System.out.println("Toal window height is --> "+Windowheight);
		
		//Condition accept when object x is less than 1/4 of the screen width
		if(Obj_y < Windowheight/2)
			System.out.println("Object presented Top side of the page");
		else
			System.out.println("Object presented Down side of the page");
	}
}
