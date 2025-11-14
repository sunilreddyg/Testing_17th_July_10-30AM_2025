package pageobjects.runtests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.tests.LoginTest;
import pageobjects.tests.RegisterTest;

class Running_Registraton_Tests {

	 WebDriver driver;
	 private String baseUrl = "https://demowebshop.tricentis.com/register";
	 RegisterTest regtest;
	 LoginTest logintest;
	 
	@BeforeEach
	void setUp() throws Exception 
	{
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		regtest=new RegisterTest(driver);
		logintest=new LoginTest(driver);
		
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		try {
			Thread.sleep(5000);
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	//@Test
	void test1() 
	{
		regtest.testRegisterWithValidData();
		
	}
	
	@Test
	void test2() 
	{
		String baseUrllogin = "https://demowebshop.tricentis.com/login";
		driver.navigate().to(baseUrllogin);
		logintest.testLoginWithValidCredentials();
		
	}

}
