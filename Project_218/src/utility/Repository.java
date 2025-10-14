package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class Repository 
{
	
	WebDriver driver;
	
	public Repository(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	//To Upload file from local system
	
	 public void uploadFile(String filePath)  
	 {
		//Select String
		StringSelection spath=new StringSelection(filePath);
		
		//Get system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		
		//add selected string to clipboard
		clipboard.setContents(spath, spath);
		
			
			//Create object for robot
			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
