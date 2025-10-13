package com.bq.webdriver.ScreenCapture;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenRepository 
{
	
	
	WebDriver driver;

	public ScreenRepository(WebDriver driver) 
	{
		this.driver=driver;
		FileHandler.createDir(new File("MyScreens"));
	}
	
	public void captureScreen(String filename)
	{
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("MyScreens//"+filename+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void captureScreenAtElement(WebElement ele,String filename)
	{
		try {
			File src=ele.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("MyScreens//"+filename+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void takefullscreenshot(String filename)
	{
		  try {
			  
			ImageIO.write(new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000))
			            .takeScreenshot(driver)
			            .getImage(), "PNG", new File("MyScreens//"+filename+".png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public void fullscreenFirefox(String filename)
	{
		 // Take full page screenshot
        File src = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
        try {
			FileHandler.copy(src, new File("MyScreens//"+filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void capturescreenWithTime(String filename)
	{
		 //Capture Current System Date
        Date d=new Date();
        //Create object for Date formatter class
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        //COnvert date using date formatter
        String time=df.format(d);
		
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
			FileHandler.copy(src, new File("MyScreens\\"+filename+time+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ScreenRepository sr=new ScreenRepository(driver);
		sr.captureScreen("loginPage");
		
		//Identifying form at webpage
		WebElement Form=driver.findElement(By.cssSelector("form[data-testid='royal_login_form']"));
		sr.captureScreenAtElement(Form, "LoginScreen");
		
		WebElement Footerlinks=driver.findElement(By.className("pageFooterLinkList"));
		sr.captureScreenAtElement(Footerlinks, "Footerlinks");
		
		sr.takefullscreenshot("Fb");
		
		sr.capturescreenWithTime("home");
		
		sr.fullscreenFirefox("fbhome");
	}

}
