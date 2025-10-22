package com.bq.webdriver.GetAttribute;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class GetRuntime_Attributes {
	WebDriver driver=null;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		Thread.sleep(5000);
		driver.quit();
	}

	//@Test
	void test1() 
	{
		driver.get("https://www.makemytrip.com/flights/");
		
		try {
			//close advertise window
			driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Roundtrip
		WebElement Roundtrip=driver.findElement(By.cssSelector("li[data-cy='roundTrip']"));
		Roundtrip.click();
		
		String Attr_Val=Roundtrip.getAttribute("class");
		System.out.println("Attribute value at runtime: "+Attr_Val);
		
		//Using junit Assert statement
		Assert.assertTrue(Attr_Val.contains("selected"));
		System.out.println("Roundtrip is selected");
		
		
		//using java conditional statement
		if(Attr_Val.contains("selected"))
		{
			System.out.println("Roundtrip is selected");
		}
		else
		{
			System.out.println("Round trip is not selected");
		}
		
	}
	
	
	//@Test
	public void test2()
	{
		driver.get("https://www.skyscanner.co.in/");
		
		WebElement Hotels=driver.findElement(By.id("skhot"));
		String RuntimeClass=Hotels.getAttribute("class");
		System.out.println(RuntimeClass);
		Assert.assertTrue(RuntimeClass.contains("selected"));
		System.out.println("Hotels is Selected");
	}
	
	
	//@Test//To Verify object enabled at webpage
	public void test3() throws Exception
	{
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		
		//Type email and password
		email.sendKeys("9030248855");
		Password.sendKeys("abcedefhti123");
		Thread.sleep(5000);
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[.='Log in']"));
		String Runtime_val=loginbtn.getAttribute("disabled");
		System.out.println(Runtime_val);
		
		if(Runtime_val==null)
			System.out.println("Object enabled");
		else
			System.out.println("Object disabled");
	}
	
	@Test  //To Verify Object disabled at page
	public void test4() throws Exception
	{
		driver.get("https://www.instagram.com/");
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[.='Log in']"));
		String Runtime_val=loginbtn.getAttribute("disabled");
		System.out.println(Runtime_val);
		
		if(Runtime_val.equals("true"))
			System.out.println("Object disabled");
		else
			System.out.println("Object enabled");
	}


}
