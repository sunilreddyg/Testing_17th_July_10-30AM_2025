package com.bq.webdriver.ScreenCapture;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class FullPageScreenshotFirefox 
{
    public static void main(String[] args) throws IOException {
        
    	/*
    	 *  From selenium 4 onwards FirefoxDriver class
    	 *  had default method to capture fullscreenshot of the page
    	 */
    	
    	// Initialize FirefoxDriver
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        // Navigate to the target URL
        driver.get("https://www.example.com");

        // Capture full-page screenshot
        File srcFile = driver.getFullPageScreenshotAs(OutputType.FILE);

        // Define destination file
        File destFile = new File("fullPageScreenshot_Firefox.png");

        // Copy screenshot to destination
        FileHandler.copy(srcFile, destFile);
        System.out.println("Full-page screenshot captured for Firefox.");

        driver.quit();
    }
}