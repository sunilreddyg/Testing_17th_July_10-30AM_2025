package com.bq.webdriver.ScreenCapture;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Element_ScreenShort {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Taksing Screen shot at Selected element
		WebElement Element=driver.findElement(By.linkText("Create new account"));
		File src=Element.getScreenshotAs(OutputType.FILE);
		
		//Copy file to local folder
		FileHandler.copy(src, new File("screens\\createactnbtn.png"));

		
		//Identifying form at webpage
		WebElement Form=driver.findElement(By.cssSelector("form[data-testid='royal_login_form']"));
		File scr1=Form.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scr1, new File("screens\\regform.png"));
	}

}
