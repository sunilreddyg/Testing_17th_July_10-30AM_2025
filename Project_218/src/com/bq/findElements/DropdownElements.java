package com.bq.findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownElements {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		WebElement MonthEle=driver.findElement(By.name("birthday_month"));
		List<WebElement> list=new Select(MonthEle).getOptions();
		
		for (WebElement webElement : list) 
		{
			System.out.println(webElement.getText());
			webElement.click();
			Thread.sleep(500);
		}
		
		
		
		

	}

}
