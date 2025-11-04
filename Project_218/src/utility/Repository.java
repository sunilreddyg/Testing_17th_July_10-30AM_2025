package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	 
	 
	 //To Verify Expected page title preseted
	 public boolean VerifyPageTitle(String exptitle)
	 {
		 boolean flag=driver.getTitle().contains(exptitle);
		 return flag;
	 }
	 
	 
	//To Verify Expected page url preseted
	 public boolean VerifyPageUrl(String expurl)
	 {
		 boolean flag=driver.getCurrentUrl().contains(expurl);
		 return flag;
	 }
	 
	 
	//To Verify Expected page url preseted
	 public boolean VerifyElemntAtsource(String ExpElement)
	 {
		 boolean flag=driver.getPageSource().contains(ExpElement);
		 return flag;
	 }
	 
	 
	 //To Verify Any Element presnted at DOM [Document Object Model]
	 public boolean VerifyElementPresentedAtDOM(By loc)
	 {
		 boolean flag=false;
		 try {
			driver.findElement(loc);   //Error code
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return flag;
	 }
	 
	 
	 //Reading data form Specific row and cell
	 public String ReadTableData(By tablepath,int row, int cell)
	 {
		 WebElement Table=driver.findElement(tablepath);
		 return Table.findElements(By.tagName("tr")).get(row)  //row
					 .findElements(By.tagName("td")).get(cell)  //cell
					 .getText();
					
	 }
	 
}
