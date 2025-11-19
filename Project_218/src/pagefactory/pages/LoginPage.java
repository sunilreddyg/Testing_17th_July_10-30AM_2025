package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageFactory_keywords;

public class LoginPage 
{
	
	WebDriver driver;
	PageFactory_keywords keywords;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		keywords=new PageFactory_keywords(driver);
	}
	
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	
	public void typeemail(String username)
	{
		keywords.TypeText(email, username);
	}
	
	

}
