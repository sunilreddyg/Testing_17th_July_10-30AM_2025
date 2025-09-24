package com.bq.webdriver.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DrodpwnSelection {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	

		WebElement Search=driver.findElement(By.id("searchDropdownBox"));
		Search.click();
		Thread.sleep(2000);
		
		String AppsGames="//*[@id=\"searchDropdownBox\"]/option[9]";
		driver.findElement(By.xpath(AppsGames)).click();
		System.out.println("Apps and Games Selected");
		
		/*
		 * To Select dropdown option we can also use click method...
		 */
		
	}

}
