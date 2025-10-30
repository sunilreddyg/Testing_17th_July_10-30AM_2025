package com.bq.webdriver.wait_implicit;


import java.time.Duration;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class ExplicitWaitCommands 
{
	WebDriver driver=null;
	WebDriverWait wait=null;
	JavascriptExecutor js;
	Actions action=null;
	
	
	@BeforeEach
	void Prcondition() throws Exception 
	{
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.manage().window().maximize();
		js=((JavascriptExecutor)driver);
		new Actions(driver);
		
		driver.get("https://demowebshop.tricentis.com/");

	}

	
	@AfterEach
	void postcondition() throws Exception 
	{
		Thread.sleep(5000);
		driver.quit();
	}

	
	String exptitle="Demo Web Shop";
	//@Test
	void waitfortitle() 
	{
		
		
		boolean flag=wait.until(ExpectedConditions.titleContains(exptitle));
		Assert.assertTrue(flag);
		System.out.println("Expected title verify");
	}
	
	
	String expurl="tricentis.com";
	//@Test
	void waitforurl() 
	{
		boolean flag=wait.until(ExpectedConditions.urlContains(expurl));
		Assert.assertTrue(flag);
		System.out.println("Expected url verified");
	}
	
	
	By register=By.linkText("Register");
	//@Test
	void waitforvisibility()
	{
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(register))
			.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//@Test
	void waitforInvisibility()
	{
		try {
			boolean flag=wait.until(ExpectedConditions.invisibilityOfElementLocated(register));
			System.out.println("Object is Invisible--> "+flag);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	By login=By.linkText("Log in");
	//@Test
	void waitforClickability()
	{
		try {
			wait.until(ExpectedConditions.elementToBeClickable(login))
			.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	By Male_Rbtn=By.id("gender-male");
	//@Test
	void waitforselectable()
	{
		try {
			driver.findElement(register).click();
			driver.findElement(Male_Rbtn).click();
			wait.until(ExpectedConditions.elementSelectionStateToBe(Male_Rbtn, true));
			System.out.println("male radio button selected");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void waitforalert()
	{
		
		driver.get("https://demowebshop.tricentis.com/");
		try {
			By SearchBtn=By.xpath("//input[@value='Search']");
			driver.findElement(SearchBtn).click();
			wait.until(ExpectedConditions.alertIsPresent()).accept();
			System.out.println("Alert is presented");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
