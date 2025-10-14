package com.bq.webdriver.BrowserOptions.Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxOptions_Example {

	public static void main(String[] args) throws Exception {
		
		
		
		FirefoxOptions options=new FirefoxOptions();
		//options.addArguments("--headless");
	    //options.addArguments("--private"); // Launch in private browsing mode
		
		// Set the preference to disable web notifications
        // dom.webnotifications.enabled controls the overall web notifications feature
        options.addPreference("dom.webnotifications.enabled", false);
		
        
        
        
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
