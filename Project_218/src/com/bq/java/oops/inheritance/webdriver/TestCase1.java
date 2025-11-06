package com.bq.java.oops.inheritance.webdriver;


public class TestCase1 extends TestBase
{
	

	public void PostAreel()
	{
		setupbrowser();
		userlogin();
		capturescreen("FBHome");
		System.out.println(driver.getTitle());
	}


}
