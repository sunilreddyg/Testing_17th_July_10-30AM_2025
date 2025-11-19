package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_Keywords 
{
	WebDriver driver;
	String screenpath="Screens\\";
	String mainwindowid;
	WebDriverWait wait;
	
	public PageObject_Keywords(WebDriver driver) 
	{
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	}

	public void sleep(long ms)
	{
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			
		}
	}
	

	//Type text into Entryboxes
	public void typetext(By loc,String input)
	{
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(loc))
			.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Type Text using keyboard actions
	public void keyboard_Sendtext(By locator,String input)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Actions(driver).sendKeys(Element, input);
	}
	

	
	/*
	 * Left Mouseclick actions[Suites for Buttons,Links,RadioButton,
	 * Checkbox,Tabs,ListofItems]
	 */
	public void ClickElemnet(By loc)
	{
		try {
			driver.findElement(loc).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Select Dropdown option using OptinName [Suites for Select Tag Elements]
	public void selectdropdownoption(By loc,String optionname)
	{
		try {
			new Select(driver.findElement(loc))
			.selectByVisibleText(optionname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//CaptureScreen
	public void CaptureScreen(String Imagename)
	{
			String time=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss").format(new Date());
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(screenpath+Imagename+time+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//CaptureScreen at location
	public void CaptureScreen(By loc,String Imagename)
	{
			String time=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss").format(new Date());
		try {
			File src=driver.findElement(loc).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(screenpath+Imagename+time+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Switch to second window
	public void SwitchToNextWindow()
	{
		 //Get All Window IDs
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
		for (String EachWindowID : AllWindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
		}
		
	}
	
	
	//Switch back to mainwindow
	public void GetbacktoMainwindow()
	{
		driver.switchTo().window(mainwindowid);
	}
	
	//Switch to window with title
	public void switchtowindowWithTitle()
	{
		 //Get All Window IDs
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    
		for (String EachWindowID : AllWindowIDS) 
		{
			String PageTitle=driver.switchTo().window(EachWindowID).getTitle();
			if(PageTitle.contains("Instagram"))
			{
				break;   //Break stop iteration and eject from looping
			}
		}
	}
	
	//Create New Tab 
	public WebDriver CreateNewTAB()
	{
		return driver.switchTo().newWindow(WindowType.TAB);
	}
	
	//Create New Tab 
	public WebDriver CreateNewWIndow()
	{
		return driver.switchTo().newWindow(WindowType.WINDOW);
	}
	
	
	//Switch to frame
	public void SwitchToNewFrame(String FrameNameOrID)
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(FrameNameOrID);
	}
	
	//Switch to Frame Using Frame Reference
	public void SwitchtoFrame_UsingFrameLocation(By FrameXpath )
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(FrameXpath));
	}
	
	
	//Verify Title presented
	public boolean  VerifyPageTitle(String ExpTitle)
	{
		return driver.getTitle().equals(ExpTitle);
	}
	
	//Verify Url Presented
	public boolean verifyPageurl(String Expurl)
	{
		return driver.getCurrentUrl().contains(Expurl);
	}
	
	//Verify ElementPresentedAtSource
	public boolean VerifyElementAtSource(String ElementID)
	{
		return driver.getPageSource().contains(ElementID);
	}
	
	
	//Verify ElementPresentedAtSource
	public WebElement CheckElementPresentedAtSource(By loc)
	{
		try {
			return driver.findElement(loc);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//Check Text Presented at webpage
	public boolean VerifyTextAtWebpage(String ExpText)
	{
		String PageText=driver.findElement(By.tagName("body")).getText();
		return PageText.contains(ExpText);
	}
	
	//Check Text Presented at location
	public boolean VerifyTextAtLocation(By loc,String ExpText)
	{
		boolean flag=false;
		if(CheckElementPresentedAtSource(loc)!=null)
		{
			String PageText=driver.findElement(loc).getText();
			 flag=PageText.contains(ExpText);
		}
		return flag;
	}
	
	//Read Text Presented at location
	public String ReadtextAtLocation(By loc)
	{
		String Pagetext=null;
		if(CheckElementPresentedAtSource(loc)!=null)
		{
			Pagetext=driver.findElement(loc).getText();
		}
		return Pagetext;
	}

}
