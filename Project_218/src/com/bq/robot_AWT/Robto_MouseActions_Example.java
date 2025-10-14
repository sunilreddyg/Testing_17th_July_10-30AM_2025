package com.bq.robot_AWT;

import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Repository;

public class Robto_MouseActions_Example {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(5000);
		
		
		robot.mouseMove(472, 417);
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		//Type Text using Robot class
		Repository repo=new Repository(driver);
		repo.uploadFile("SunilReddy");
		
		

	}

}
