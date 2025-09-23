package com.bq.webdriver.Textbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {

	public static void main(String[] args) throws Exception {
		
		
		//Browser UP and loading webpage
		String URL="https://www.facebook.com/r.php?";
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Typing text into editbox
		driver.findElement(By.name("firstname")).sendKeys("Kiran");
		
		//Clear text from textbox [only works from textbox]
		Thread.sleep(5000);  
		driver.findElement(By.name("firstname")).clear();
		
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Arjun");
		
		
		//Clearing text using backspace shortcut
		driver.findElement(By.name("firstname"))
		.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,
				Keys.BACK_SPACE,Keys.BACK_SPACE);
		
		
		
	}

}
