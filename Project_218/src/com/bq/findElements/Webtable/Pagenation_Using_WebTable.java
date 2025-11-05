package com.bq.findElements.Webtable;

import java.security.DrbgParameters.NextBytes;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagenation_Using_WebTable {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.financialexpress.com/mutual-funds/screener/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		
		WebElement table;
		List<WebElement> rows;
		boolean flag=false;
		
		do {
			
			table=driver.findElement(By.xpath("//*[@id=\"mutualFundCom\"]/div[3]/div/table"));
			rows=table.findElements(By.tagName("tr"));
			System.out.println(rows.size());
			
			for (WebElement eachrow : rows) {
				System.out.println(eachrow.getText());
			}
			
			WebElement NextBtn=driver.findElement(By.xpath("//div[@class='pagination ']/button[2]"));
			flag=NextBtn.isEnabled();
			
			if(NextBtn.isEnabled())
				NextBtn.click();
			
			Thread.sleep(5000);
		} while (flag==true);
		
		
		
		
		
	}

}
