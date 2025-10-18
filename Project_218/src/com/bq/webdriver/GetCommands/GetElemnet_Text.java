package com.bq.webdriver.GetCommands;

import java.time.Duration;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElemnet_Text 
{

	
	WebDriver driver;
	String Site1="https://demowebshop.tricentis.com/";
	By Categories=By.xpath("//strong[.='Categories']");
	
	@BeforeEach //Invoke before every test
	void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.get(Site1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterEach   //Invoke after every test
	void tearDown() throws Exception {

		Thread.sleep(5000);
		driver.quit();
	}
	
	//@Test
	public void CheckingTextPresentedAtElement()
	{
		//Identifying Perticular location
		WebElement Categ=driver.findElement(Categories);
		String Acttext=Categ.getText();
		Assert.assertEquals("CATEGORIES", Acttext);
		System.out.println("Text presnetd at location");
	}
	
	//@Test
	public void CheckingTextPresentedAtPage()
	{
		//Identifying Complete page location
		String PageText=driver.findElement(By.tagName("body")).getText();
		System.out.println(PageText);
		String Exp_Text="NEWSLETTER";
		Assert.assertTrue(PageText.contains(Exp_Text));
		System.out.println("Expected text presented at webpage");
	}
	
	
	@Test 
	void CheckingOptionPresetedAt_Containers()
	{
		//Identify Perticular DOM area at webpage
		By Cat=By.xpath("//div[contains(@class,'category-navigation')]");
		String CategoryDOMText=driver.findElement(Cat).getText();
		System.out.println(CategoryDOMText);
		
		Assert.assertTrue(CategoryDOMText.contains("Jewelry"));
		System.out.println("Expected Text presented uder categories");
	}
	
	

}
