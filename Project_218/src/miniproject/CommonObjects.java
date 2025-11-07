package miniproject;

public interface CommonObjects 
{
	/*
	 * By default all variable under interface class
	 * are "static" and "final"
	 */
	public String loginemail="//input[@name='username']";
	public String loginpassword="//input[@type='password']";
	public String submitlogin="//button[contains(.,'Login')]";
	public String dashboard="//h6[contains(.,'Dashboard')]";

	//MenuTabs
	public String MenuTabsMyinfo="//span[contains(.,'My Info')]";
	public String Contactdetails="//a[contains(.,'Contact Details')]";
	public String mobilenum="//input[data-v-1f99f73c]";
}
