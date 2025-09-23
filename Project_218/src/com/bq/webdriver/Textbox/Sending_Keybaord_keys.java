package com.bq.webdriver.Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sending_Keybaord_keys {

	public static void main(String[] args) {
		
		
		//Browser UP and loading webpage
		String URL="https://www.facebook.com/r.php?";
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Kiran",Keys.TAB,"Rao");

		driver.findElement(By.name("birthday_day"))
		.sendKeys("23");
		
		driver.findElement(By.name("birthday_month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		driver.findElement(By.name("birthday_year"))
		.sendKeys("1986");
		
		driver.findElement(By.xpath("//input[@value='1']"))
		.sendKeys(Keys.SPACE);
		
		
	}

}
