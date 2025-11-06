package com.bq.java.oops.inheritance.webdriver;

import org.openqa.selenium.By;

public class TestBase extends Common_Reusable_Actions
{
	String url="http://facebook.com";
	String username="//input[@id='email']";
	String password="//input[@id='pass']";
	
	
	public void setupbrowser()
	{
		LaunchBrowser("chrome");
		setwindow_size(1080,700);
		load_webpage(url);
		set_explicitwait_time(30);
	}
	
	public void userlogin()
	{
		boolean flag=driver.findElement(By.xpath(username)).isDisplayed();
		System.out.println(flag);
		if(flag==true)
		{
			Type_text(username, "darshan");
			Type_text(password, "Hello@123");
		}
	}
	
	public void endbrowser()
	{
		close_browser();
	}
	
	

}
