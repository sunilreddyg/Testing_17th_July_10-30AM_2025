package miniproject;


public class TestBase extends CommonActions implements CommonObjects,CommonInputs
{

	
	public void loginvalid() 
	{
		if(VerifyPageTitle(Ippagetitle))
		{
			typetext(loginemail, Ipusenrame);
			typetext(loginpassword, Ippassword);
			ClickonElement(submitlogin);
			Waitforvisible(dashboard);
		}
		else
			System.out.println("Title not verified");
		
		
	}

}
