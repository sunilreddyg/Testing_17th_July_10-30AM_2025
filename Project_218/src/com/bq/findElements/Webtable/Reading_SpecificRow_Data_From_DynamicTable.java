package com.bq.findElements.Webtable;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reading_SpecificRow_Data_From_DynamicTable {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.investing.com/equities/icici-bank-ltd-historical-data");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(5000);
		WebElement Table=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[2]/div[1]/div[3]/div[3]/table/tbody"));
		
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		
		for (WebElement Eachrow : rows) 
		{
			//Read Eachrow
			String RowText=Eachrow.getText();
			if(RowText.contains("27-10-2025"))
			{
				//Finding list of cells under each row
				List<WebElement> cells=Eachrow.findElements(By.tagName("td"));
				String Shareprice=cells.get(1).getText();
				String sharevol=cells.get(5).getText();
				System.out.println(Shareprice+"  "+sharevol);
				break;
			}
			
		}

	}

}
