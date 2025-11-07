package miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions 
{
	
	protected WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriverWait wait;
	int windowHeight=1024;
	int  windowWidth=768;
	int timeinsec=100;
	String Mainwindow;
	/*
	 * Launch Browser [chrome,firefox,ie]
	 */
	public void launchBrowser(String browser)
	{
		switch (browser) 
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			driver=new InternetExplorerDriver();
			break;
			
		default:System.out.println("Browser Name mismatched");
			break;
		}
	}
	
	
	//Loading WebPage
	public void LoadPage(String url)
	{
		if(driver!=null)
		{
			driver.get(url);
			Mainwindow=driver.getWindowHandle();
		}
		else
			System.out.println("Browser launch failed");
	}
	
	
	//Manage Time and window
	public void implicttimeout(int timeinsec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeinsec));
	}
	
	public void explicitwait(int timeinsec)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(timeinsec));
	}
	
	
	//Manage window
	public void managewindow(int width,int height)
	{
		driver.manage().window().setSize(new Dimension(width, height));
	}
	
	
	//SetupBrowser
	public void setupchrome()
	{
		launchBrowser("chrome");
		LoadPage(url);
		managewindow(windowWidth, windowHeight);
		implicttimeout(timeinsec);
		explicitwait(timeinsec);
	}
	
	//SetupBrowser
	public void setupfirefox()
	{
		launchBrowser("firefox");
		LoadPage(url);
		managewindow(windowWidth, windowHeight);
		implicttimeout(timeinsec);
		explicitwait(timeinsec);
	}
	
	
	//Get Browser Driver
	public WebDriver getDriver()
	{
		return driver;
	}
	
	
	//Verify PagetTitle
	public boolean VerifyPageTitle(String ExpTitle)
	{
		boolean flag=false;
		if(driver!=null)
		{
			try {
				wait.until(ExpectedConditions.titleContains(ExpTitle));
				System.out.println("Page title Verified :-->"+driver.getTitle());
				flag=true;
			} catch (Exception e) {
				System.out.println("Page Title Not Verified:--> "+driver.getTitle());
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("browser launch failed");
		}
		
		return flag;
	}
	
	
	//Send Text to Editbox/Textbox/Entrybox using default method
	public void typetext(String xpath,String input)
	{
		try {
			wait.until(ExpectedConditions.
					visibilityOfElementLocated(By.xpath(xpath))).sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Send Text to Editbox/Textbox/Entrybox using mouse action
	public void sendkeystoTextbox(String xpath,String input)
	{
		try {
			WebElement Element=wait.until(ExpectedConditions.
					visibilityOfElementLocated(By.xpath(xpath)));
			new Actions(driver).sendKeys(Element, input).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//ClickMethod
	public void ClickonElement(String xpath)
	{
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * KeyWord:--> This keyword Click on location using mouse actions[Buttons,Radio,Checkbox,list---etc]
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void click_element_using_Mouse(String xpath)
	{
		try {
			
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			new Actions(driver).click(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/*
	 * KeyWord:--> This keyword Click on location [Buttons,Radio,Checkbox,list---etc]
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void click_element__with_js(String xpath)
	{
		
		try {
			
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//ManageExplicitwait
	public WebElement Waitforvisible(String  xpath)
	{
		try {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//Wait for VisibilityofObject
	public WebElement Waitfor(String type,String xpath)
	{
		WebElement Element=null;
		switch (type) {
		case "visible":
			Element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			break;
			
		case "clickable":
			Element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			break;

		case "presence":
			Element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			break;
		default: System.out.println("Mismatch");
			break;
		}
		
		return Element;
	}
	
	
	//Select Dropdown option using OptinName [Suites for Select Tag Elements]
	public void selectdropdownoption(String xpath,String optionname)
	{
		try {
			new Select(Waitforvisible(xpath)).selectByVisibleText(optionname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Clear Text from Editbox
	public void Cleartext(String Xpath)
	{
		try {
			driver.findElement(By.xpath(Xpath)).clear();
			verify_inputPresented_At_Textbox(Xpath, "");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword Select Dropdown Option using [text,value,index] numbers
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void select_dropdown(String xpath,String selector,String option)
	{
		try {
			
			WebElement Element=Waitfor("visible", xpath);
			Select dropdown_selector=new Select(Element);
			switch (selector) {
			case "text":
				dropdown_selector.selectByVisibleText(option);
				break;
				
			case "value":
				dropdown_selector.selectByValue(option);
				break;
				
			case "index":
				int index = Integer.parseInt(option);
				dropdown_selector.selectByIndex(index);
				break;

			default:System.out.println("selector mismatch");
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * KeyWord:--> This keyword perform mouseHover action on element
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void mousehover(String xpath)
	{
		try {
		
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			new Actions(driver).moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * KeyWord:--> This keyword perform RightClick action on element
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void RightClick_Action(String xpath)
	{
		try {
		
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			new Actions(driver).contextClick(element).perform();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/*
	 * KeyWord:--> This keyword perform RightClick action on element
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void DoubleClick_Action(String xpath)
	{
		try {
		
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			new Actions(driver).doubleClick(element).perform();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/*
	 * KeyWord:--> This keyword perform DragAndDrop option
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void drag_element_to_Target(String Sourcexpath,String targetxpath)
	{
		
		try {
			Waitforvisible(Sourcexpath);
			WebElement Src=driver.findElement(By.xpath(Sourcexpath));
			WebElement Target=driver.findElement(By.xpath(targetxpath));
			new Actions(driver).dragAndDrop(Src, Target).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * KeyWord:--> This keyword drag object to requried target
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void drag_element_to_required_coordinates(String Sourcexpath,int xcoord, int ycoord)
	{
		
		try {
			WebElement Src=driver.findElement(By.xpath(Sourcexpath));
			new Actions(driver).dragAndDropBy(Src, xcoord, ycoord).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * KeyWord:--> Send keys any requied location
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void Send_keyboard_keys(String xpath,Keys key)
	{
		
		WebElement Src=driver.findElement(By.xpath(xpath));
		new Actions(driver).sendKeys(Src, key).perform();
	}
	
	/*
	 * KeyWord:--> Capture Screen
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	/*
	 * KeyWord:--> CaptureScreen
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void capturescreen(String imagename)
	{
		//Get System Default Time
		Date date=new Date();    //import java.util;
		//create simple dataformat
		DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Cover default system date using date formatter
		String time=df.format(date);
				
				
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.createDir(new File("Screens"));
			FileHandler.copy(src, new File("Screens\\"+time+imagename+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * KeyWord:--> Switch to Next window
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchto_next_window()
	{
		Set<String> allwindowids=driver.getWindowHandles();
		for (String eachwindow : allwindowids) {
			driver.switchTo().window(eachwindow);
		}
	}
	
	
	/*
	 * KeyWord:--> Switch back to mainwindow
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchto_mainwindow()
	{
		driver.switchTo().window(Mainwindow);
	}
	
	/*
	 * KeyWord:--> Switch requried window using it's title
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void swithcto_window_using_page_title(String exp_title)
	{
		//Get All Dynamic WIndow ID's
		Set<String> AllWindowIDS=driver.getWindowHandles();
		//Using foreach loop iterate for number of windows
		for (String EachWindowID : AllWindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
			
			//Get Current FoCused window tilte
			String runtime_title=driver.getTitle();
			//System.out.println(runtime_title);
			
			if(runtime_title.contains(exp_title))
			{
				break;  //IT stop iteration   [Break will stop iteration when required title found]
			}
			
		}
	}
	
	/*
	 * KeyWord:--> CLose alert 
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	
	public void close_alert()
	{
		try {
			new WebDriverWait(driver,Duration.ofSeconds(30))
			.until(ExpectedConditions.alertIsPresent()).accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * KeyWord:-->Verify alert text
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_alert_text(String Exp_text)
	{
		boolean flag=false;
		try {
			
			String alert_text=new WebDriverWait(driver,Duration.ofSeconds(30))
			.until(ExpectedConditions.alertIsPresent()).getText();
			flag=alert_text.equals(Exp_text);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	
	/*
	 * KeyWord:-->Verify Switch to frame
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchtoFrame_using_FrameName(String FrameID_or_name)
	{
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameID_or_name));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * KeyWord:-->Verify Switch to frame
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchtoFrame_using_FrameIndex(String Index)
	{
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Index));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/*
	 * KeyWord:-->Switch Control back to mainpage from frame
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switch_from_frame_tomainwindow()
	{
		driver.switchTo().defaultContent();
	}
	
	/*
	 * KeyWord:-->Verify Expected page title presented
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_titlePresented(String Exp_title)
	{
		boolean flag=false;
		try {
			wait.until(ExpectedConditions.titleIs(Exp_title));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	
	/*
	 * KeyWord:-->Verify Expected url presented at webpage
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_urlPresented(String Exp_url)
	{
		boolean flag=false;
		try {
			wait.until(ExpectedConditions.urlContains(Exp_url));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	/*
	 * KeyWord:-->Verify Expected element is presented at source
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_Element_Presented_Source(String Xpath)
	{
		boolean flag=false;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	
	/*
	 * KeyWord:-->Verify Text presented at location
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_text_presented_At_location(String Xpath,String text)
	{
		boolean flag=false;
		try {
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(Xpath), text));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	/*
	 * KeyWord:-->THis keyword verify text presented at required location
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean Verify_element_text(String xpath,String exp_text)
	{
		String element_text=driver.findElement(By.xpath(xpath)).getText();
		boolean flag=element_text.equalsIgnoreCase(exp_text);
		return flag;
	}
	
	
	/*
	 * KeyWord:-->Verify Text visible at webpage
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_text_visible_at_webpage(String Exp_text)
	{
		WebElement Page=driver.findElement(By.tagName("body"));
		String Act_Text=Page.getText();
		return Act_Text.contains(Exp_text);
	}
	
	
	/*
	 * KeyWord:-->Verify any inputvalue presented at editbox
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_inputPresented_At_Textbox(String Xpath,String exp_input)
	{
		boolean flag=false;
		try {
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(Xpath), exp_input));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	/*
	 * Keyword:-->This keyword return selected value from dropdown
	 * Author:-->
	 * Parameters used:-->
	 */
	public String getSelectedValueInDropDown(String xpath)
	{
		String OptionText=new Select(driver.findElement(By.xpath(xpath))).getFirstSelectedOption().getText();
		return OptionText;
	}
	
	
	/*
	 * Keyword:-->This keyword Verify runtime Attribute value
	 * Author:-->
	 * Parameters used:-->
	 */
	public boolean verify_runtime_Attribute_value(String xpath, String attributname,String exp_attibutevalue)
	{
		String Runtime_Attribute_Value=driver.findElement(By.xpath(xpath)).getAttribute(attributname);
		return Runtime_Attribute_Value.contains(exp_attibutevalue);
	}
	
	
	
	/*
	 * Keyword:-->Scroll window vertical
	 * Author:-->
	 * Parameters used:-->
	 */
	public void ScollWindow_V()
	{
		try {
			((JavascriptExecutor)driver).executeScript("window.scroll(0,100)");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	/*
	 * Keyword:-->Close Current Window
	 * Author:-->
	 * Parameters used:-->
	 */
	public void close_browser()
	{
		driver.close();
	}
	
	/*
	 * Keyword:-->Upload File From Local System
	 * Author:-->
	 * Parameters used:-->
	 */
	public void Uploadfile(String path)
	{
		StringSelection spath=new StringSelection(path);
		//Enable Clipboard access 
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//set content to clipbaord
		clipboard.setContents(spath, spath);
		
		//Creating object for robot class
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.setAutoDelay(2000);
		
		//Pressing Control+V Shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Releasing Control key [If don't release it will interupt your next run]
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	
	
	/*
	 * Keyword:-->Close all windows
	 * Author:-->
	 * Parameters used:-->
	 */
	public void close_Allwindows()
	{
		driver.quit();
	}
	

}
