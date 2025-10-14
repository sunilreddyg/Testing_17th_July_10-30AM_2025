package com.bq.robot_AWT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Robot_Mouse_Syntax
{

	public static void main(String[] args) throws AWTException
	{
		
		//Create object for Robot framework
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Move cursor to required location
		robot.mouseMove(100, 200);
		
		//Mouse click
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); //left click
		robot.mousePress(InputEvent.BUTTON2_DOWN_MASK); //middle click
		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK); //right click
		
		//Release mouse
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		//Scroll
		robot.mouseWheel(100);
		
		
	}

}
