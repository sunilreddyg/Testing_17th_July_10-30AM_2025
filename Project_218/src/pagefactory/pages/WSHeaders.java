package pagefactory.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WSHeaders 
{
	
	@FindBy(xpath = "//a[contains(.,'Register')]")
	private WebElement register;
	
	@FindBy(xpath = "//a[contains(.,'Log in')]")
	private WebElement login;
	
	@FindBy(xpath = "//span[contains(.,'Shopping cart')]")
	private WebElement shoppingCart;
	
	
	@FindBy(xpath = "//span[contains(.,'Wishlist')]")
	private WebElement wishlist;
	
	
	
	
	public void clickwishtlist()
	{
		wishlist.click();
	}
	
	public void clickshoppingcart()
	{
		shoppingCart.click();
	}
	
	public void clicklogin()
	{
		login.click();
	}
	
	public boolean checklogindisplayed()
	{
		return login.isDisplayed();
	}
	
	
	public void clickregister()
	{
		register.click();
	}

}
