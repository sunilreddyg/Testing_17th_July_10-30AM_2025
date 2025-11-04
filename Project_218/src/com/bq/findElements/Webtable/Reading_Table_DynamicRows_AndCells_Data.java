package com.bq.findElements.Webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reading_Table_DynamicRows_AndCells_Data {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nseindia.com/get-quotes/equity?symbol=ICICIBANK");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Targeting table
		WebElement Table=driver.findElement(By.xpath("//table[@id='marketDepthTable']/tbody"));
		//Find List of rows under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < rows.size(); i++) 
		{
			//Target Dynamic row
			WebElement SelectedRow=rows.get(i);
			
			//Find list of cell under selected row
			List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
			
			String Qty=cells.get(0).getText();
			String BID=cells.get(1).getText();
			String ASK=cells.get(2).getText();
			String Qty1=cells.get(3).getText();
			
			System.out.println(Qty+"\t"+BID+"\t"+ASK+"\t"+Qty1);
		}
		

	}

}
