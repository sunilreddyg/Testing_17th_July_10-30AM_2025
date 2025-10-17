package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	private WebDriver driver=null;
	
	
	/*
	 * Method launch chrome or Firefox or Edge browser
	 */
	public void launchbrowser(String browser_CH_FF_ED)
	{
		
		switch (browser_CH_FF_ED) {
		case "chrome":
			
			driver=new ChromeDriver();
			System.out.println("Chrome is UP");
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			System.out.println("firefox is UP");
			break;

		case "edge":
			driver=new EdgeDriver();
			System.out.println("edge is UP");
			break;
			
		default:
			System.out.println("Browser mismatch");
			break;
		}
	}
	
	
	

}
