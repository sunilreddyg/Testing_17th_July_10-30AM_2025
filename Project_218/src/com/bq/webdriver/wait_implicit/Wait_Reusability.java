package com.bq.webdriver.wait_implicit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.TestRepository;

class Wait_Reusability 
{
	
	WebDriver driver=null;
	WebDriverWait wait=null;
	JavascriptExecutor js;
	Actions action=null;
	TestRepository trep;
	
	@BeforeEach
	void Precondition() throws Exception 
	{
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		js=((JavascriptExecutor)driver);
		new Actions(driver);
		trep=new TestRepository(driver);

	}

	@AfterEach
	void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		//driver.quit();
	}

	
	String exptitle="Demo Web Shop";
	@Test
	void test1() {
		driver.get("https://demowebshop.tricentis.com/");
		Assert.assertTrue(trep.WaitforTitle(exptitle));
	}
	
	
	By register=By.linkText("Register");
	@Test
	void test2() {
		driver.get("https://demowebshop.tricentis.com/");
		trep.WaitforVisible(register).click();
	}


}
