package com.bq.findElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Multiple_Option_Selection {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		//using javascript converting single selectino dropdown 
		//into multiple selection dropdown
		WebElement MonthEle=driver.findElement(By.name("birthday_month"));
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].setAttribute('multiple','multiple')", MonthEle);
		Thread.sleep(4000);
		
		//Creating select class object
		Select Selector=new Select(MonthEle);
		Selector.deselectAll();
		Selector.selectByIndex(0);
		Selector.selectByIndex(11);
		
		String options[]= {"Jan","Dec"};
		
		List<WebElement> list=Selector.getAllSelectedOptions();
		
		if(list.get(0).getText().equals(options[0]))
			System.out.println("FistIndex obj presented");
		else
			System.out.println("First index obj mismatched");
		
		
		if(list.get(1).getText().equals(options[1]))
			System.out.println("SecondIndex obj presented");
		else
			System.out.println("SecondIndex obj mismatched");
		
		
	}

}
