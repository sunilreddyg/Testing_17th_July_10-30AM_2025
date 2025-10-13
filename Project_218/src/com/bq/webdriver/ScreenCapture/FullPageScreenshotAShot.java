package com.bq.webdriver.ScreenCapture;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class FullPageScreenshotAShot 
{
    public static void main(String[] args) throws IOException, Exception {
       
    	
    	// Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the target URL
        driver.get("https://amazon.in");
        Thread.sleep(3000);
        
        /*
         * Inorder to use fullscreen shout using webdriver
         * we should download below jar files and attached to project
         * 
         * =>	https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot/1.5.4
         * =>   Downlaod jar file
         * =>   Configure file to project libraries 
         * 
         * 
         * => https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot/1.5.4
         * => Downlaod jar file
         * => Configure file to project libraries
         * 
         */

        // Capture full-page screenshot using AShot
        // ShootingStrategies.viewportPasting() scrolls and stitches the page
        ImageIO.write(new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
                .takeScreenshot(driver)
                .getImage(), "PNG", new File("fullPageScreenshot_AShot.png"));

   

        driver.quit();
    }
}