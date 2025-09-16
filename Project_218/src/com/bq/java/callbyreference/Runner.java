package com.bq.java.callbyreference;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	public static void main(String[] args) {
		
		
		GetInfo info=new GetInfo();
		info.getsecondstudent().Issue().MainCertifcate();
		info.getfirststudent().Issue().MainCertifcate();
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().fullscreen();
		
	}

}
