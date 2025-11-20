package pagefactory.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class GroupELements 
{

	//Single Element
	@FindBy(id="email")
	private WebElement username;
	
	
	//Group of Elements
	@FindBy(tagName = "a") 
	List<WebElement> pagelinks;
	
	
	/*
	 * Once object is located and it will not be searched over and over again
	 * 		[Mostly it is usefull in ajax web application]
	 */
	@FindBy(name="reg_passwd__") 
	@CacheLookup WebElement Password_EB;
	

	/*
	 * @FindBYS:
	 * When Required webelement objects need to match all of the given criteria..
	 */
	@FindBys
	({
		@FindBy(tagName="select"),       
		@FindBy(className="_8esa"),
	}) List<WebElement> Bys_Group_Objects;
	
	
	/*
	 * @FindAll:-->
	 *  When required webelement objects need to match at least one of the give criteria
	 */
	
	@FindAll
	({
		@FindBy(tagName="select"),    		
		@FindBy(tagName="_8esa"),
	}) List<WebElement> Group_objects;
	
	
	
	public int getlinkscount()
	{
		return pagelinks.size();
	}
	
	public int getbygroupobjectscount()
	{
		return Group_objects.size();
	}
	
	
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		GroupELements elements=PageFactory.initElements(driver, GroupELements.class);
		System.out.println(elements.getlinkscount());
		System.out.println(elements.getbygroupobjectscount());
	}
	

}
