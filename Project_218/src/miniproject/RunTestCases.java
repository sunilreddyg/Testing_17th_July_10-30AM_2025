package miniproject;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RunTestCases extends TestBase
{
	@BeforeEach
	public void beforeall()
	{
		
	}

	@Test
	public void Changeinfo_ContactNum() 
	{
		ClickonElement(MenuTabsMyinfo);
		ClickonElement(Contactdetails);
		Cleartext(mobilenum);
		typetext(mobilenum, Ipmobile);
	}

}
