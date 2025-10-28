package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestRepository 
{
	WebDriver driver;
	WebDriverWait wait;
	int ExpTime=30;
	public TestRepository(WebDriver driver) 
	{
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(ExpTime));
	}
	
	/*
	 * Keyword:-->
	 * 	This keyword wait for the title to be presented at
	 *  the page and return boolean value true/false.
	 */
	public boolean WaitforTitle(String ExpTitle)
	{
		boolean flag=false;
		try {
			flag=wait.until(ExpectedConditions.titleContains(ExpTitle));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	/*
	 * Keyword:-->
	 * 	This keyword wait for the Url contains at the
	 *  page and return boolean value true/false.
	 */
	public boolean WaitforUrl(String ExpUrl)
	{
		boolean flag=false;
		try {
			flag=wait.until(ExpectedConditions.urlContains(ExpUrl));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	/*
	 * Keyword:-->
	 * 	This keyword wait for object to be visible at webpage
	 *  and return WebElemnt to method..
	 */
	public WebElement WaitforVisible(By loc)
	{
		WebElement element=null;
		try {
			element=wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}
	
	
}
