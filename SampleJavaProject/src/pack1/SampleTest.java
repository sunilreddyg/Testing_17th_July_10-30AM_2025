package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest 
	{

	public static void main(String[] args) 
	{
		System.out.println("Welecome to selenium demo");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");

	}

}
