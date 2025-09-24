package com.bq.webdriver.List;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListofItems 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Clicking to opne list of itmes
		WebElement ProductType=driver.findElement(By.linkText("Select Product Type"));
		ProductType.click();
		Thread.sleep(2000);
		
		
		//Selecting one of item from list
		WebElement loans=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[13]/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div/div/div[2]/div/ul/li[3]"));
		loans.click();
		
		

	}

}
