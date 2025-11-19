package pagefactory.Runner;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagefactory.testcases.RegisterTests;

class Run_RegistrationTests 
{
	WebDriver driver;
	String url="https://demowebshop.tricentis.com/";
	RegisterTests regtest;
	@BeforeEach
	void setUp() throws Exception 
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		regtest=new RegisterTests(driver);
	}

	@Test
	void test() 
	{
		regtest.RegisterHere("sunil");
	}

}
