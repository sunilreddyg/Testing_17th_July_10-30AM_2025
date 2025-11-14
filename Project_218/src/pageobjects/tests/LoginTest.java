package pageobjects.tests;

//LoginTest.
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageobjects.pages.LoginPage;

public class LoginTest 
{
    private WebDriver driver;
    private LoginPage loginPage;
    
    public LoginTest(WebDriver driver)
    {
    	loginPage = new LoginPage(driver);
    }

  
    public void testLoginWithValidCredentials() {
      
        loginPage.enterEmail("valid@example.com");
        loginPage.enterPassword("validPassword");
        loginPage.clickLoginButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("homepage")); // Replace with actual homepage URL
    }

  
    public void testLoginWithInvalidCredentials() {
     
        loginPage.enterEmail("invalid@example.com");
        loginPage.enterPassword("invalidPassword");
        loginPage.clickLoginButton();

        String errorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("Login was unsuccessful")); // Adjust based on actual error message

    }

    
    public void testRememberMeFunctionality() {
    
        loginPage.enterEmail("valid@example.com");
        loginPage.enterPassword("validPassword");
        loginPage.clickRememberMe();
        loginPage.clickLoginButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("homepage")); // Replace with actual homepage URL
       
    }

  
    public void testForgotPasswordLink() {
        String forgotPasswordUrl = driver.findElement(By.className("forgot-password")).findElement(By.tagName("a")).getAttribute("href");
        Assert.assertEquals("https://demowebshop.tricentis.com/passwordrecovery", forgotPasswordUrl);
 
    }
}