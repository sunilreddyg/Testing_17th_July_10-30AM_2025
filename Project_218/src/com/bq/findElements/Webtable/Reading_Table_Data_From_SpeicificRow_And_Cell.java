package com.bq.findElements.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reading_Table_Data_From_SpeicificRow_And_Cell {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nseindia.com/get-quotes/equity?symbol=ICICIBANK");
		driver.manage().window().maximize();
		
		
		//Targeting table
		WebElement Table=driver.findElement(By.xpath("//table[@id='marketDepthTable']/tbody"));
		//Find List of rows under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		
		//Target selected row
		WebElement SelectedRow=rows.get(3);
		
		//Find list of cell under selected row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//Read Each cell values
		String FirstCellData=cells.get(0).getText();
		System.out.println(FirstCellData);
		
		
		
		//Reading second row third cell data
		String data=Table.findElements(By.tagName("tr"))
		.get(1)  //row
		.findElements(By.tagName("td"))
		.get(2)  //cell
		.getText();
		System.out.println(data);
	}

}
