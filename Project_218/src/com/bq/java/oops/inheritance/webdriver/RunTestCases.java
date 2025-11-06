package com.bq.java.oops.inheritance.webdriver;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class RunTestCases extends Common_Reusable_Actions
{
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	By uid=By.name("username");
	By pwd=By.name("password");
	By loginbtn=By.xpath("//button[@type='submit']");
	
	
	@BeforeEach
	void setUp() throws Exception 
	{
		LaunchBrowser("firefox");
		load_webpage(url);
		set_explicitwait_time(30);
	}

	@Test
	void LoginTest() 
	{
		Type_text(uid, "Admin");
		Type_text(pwd, "admin123");
		click_element(loginbtn);
	}

}
