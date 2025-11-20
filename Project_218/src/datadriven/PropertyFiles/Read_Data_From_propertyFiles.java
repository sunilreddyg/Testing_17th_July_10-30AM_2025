package datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_From_propertyFiles {

	public static void main(String[] args) throws IOException 
	{
		
		String filepath="src\\datadriven\\PropertyFiles\\input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("File is Located");
		
		Properties repository=new Properties();
		repository.load(fi);
		
		String URL=repository.getProperty("HRM.url");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		String UID=repository.getProperty("username");
		driver.findElement(By.name("username")).sendKeys(UID);
		
		String PWD=repository.getProperty("password");
		driver.findElement(By.name("password")).sendKeys("password");
		
	}

}
