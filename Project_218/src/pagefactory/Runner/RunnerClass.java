package pagefactory.Runner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pagefactory.pages.Registerpage;
import pagefactory.pages.WSHeaders;


public class RunnerClass {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		
		//To find element with @Findy annotation we should
		//use pagefactory class initelements
		WSHeaders wsh=PageFactory.initElements(driver, WSHeaders.class);
		wsh.clickregister();
		
		Registerpage reg=new Registerpage(driver);
		reg.clickgendermale();
		reg.waitforfirstname(20);
		reg.typefirstname("Sunil");
		
	}

}
