package com.bq.robot_AWT;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadFile 
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		WebElement Exp_option=driver.findElement(By.cssSelector("div[data-val='exp']"));
		Exp_option.click();
		Thread.sleep(5000);
		
		
		WebElement upload=driver.findElement(By.cssSelector("button[class*='uploadResume']"));
		upload.click();
		Thread.sleep(2000);
		
		String path="E:\\MyResume\\SunilReddy.docx";
		
		//Select String
		StringSelection spath=new StringSelection(path);
		
		//Get system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		
		//add selected string to clipboard
		clipboard.setContents(spath, spath);
		
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		
		//Press Control+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Control
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}

}
