package pagefactory.testcases;

import org.openqa.selenium.WebDriver;

import pagefactory.pages.Registerpage;
import pagefactory.pages.WSHome;


public class RegisterTests 
{
	
	WebDriver driver;
	Registerpage reg;
	WSHome home;
	
	public RegisterTests(WebDriver driver) 
	{
		this.driver=driver;
		reg=new Registerpage(driver);
		home=new WSHome(driver);
	}
	
	public void RegisterHere(String fname)
	{
		home.clickregister();
		reg.clickgendermale();
		if(reg.checkGenderMaleSelection())
		{
			reg.typefirstname(fname);
		}
	}
	
	

}
