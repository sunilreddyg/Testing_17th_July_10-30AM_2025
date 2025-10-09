package com.bq.webdriver.javascript;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendar_DatePicker {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	
		//Login Details
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();

		
		//Click on Leave tab
		WebElement LeaveTab=driver.findElement(By.xpath("//span[contains(.,'Leave')]"));
		LeaveTab.click();
		
		WebElement Cal1=driver.findElement(By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]"));
		Cal1.click();  //It opens Calendar
		Thread.sleep(2000);
		
		WebElement Month=driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[1]"));
		Month.click(); //It Display all months
		Thread.sleep(2000);
		
		
		WebElement SelectMonth=driver.findElement(By.xpath("//li[@class='oxd-calendar-dropdown--option'][contains(.,'May')]"));
		SelectMonth.click();
		Thread.sleep(2000);
		
		
		WebElement CalDate1=driver.findElement(By.xpath("//div[@class='oxd-calendar-date'][contains(.,'21')]"));
		CalDate1.click();  //Selecting Date from calendar
		Thread.sleep(5000);
		
		//IDentify Date EntryBox
		WebElement ToDateTextbox=driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
		
		
		//To Clear Existing text from entrybox
		new Actions(driver).click(ToDateTextbox)
		.pause(2000)
		.keyDown(Keys.CONTROL)
		.sendKeys("A")
		.sendKeys(Keys.BACK_SPACE)
		.perform();
		
		
		/*
		 * using Javascript executor Typing text into editbox...
		 */
		Thread.sleep(2000);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value='2025-21-11'", ToDateTextbox);

	}

}
