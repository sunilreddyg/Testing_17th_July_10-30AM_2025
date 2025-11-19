package pagefactory.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registerpage 
{
	WebDriver driver;

	public Registerpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement gendermale;
	
	@FindBy(xpath = "//input[@name='FirstName']")
	private WebElement firstname;
	
	
	public void typefirstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	
	public void clickgendermale()
	{
		gendermale.click();
	}
	
	public void waitforfirstname(int timeinsec)
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(timeinsec))
			.until(ExpectedConditions.visibilityOf(firstname));
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	//Checking male radio button selected
	public boolean checkGenderMaleSelection()
	{
		return gendermale.isSelected();
	}
	

}
