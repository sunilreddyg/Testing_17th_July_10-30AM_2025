package pageobjects.tests;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import pageobjects.pages.RegisterPage;

public class RegisterTest 
{
   
    WebDriver driver;
    RegisterPage registerPage;
    
    public RegisterTest(WebDriver driver) 
    {
		this.driver=driver;
		registerPage=new RegisterPage(driver);
	}
   
    public void testRegisterWithValidData() 
    {
   
        registerPage.selectGenderMale();
        registerPage.enterFirstName("Pranil");
        registerPage.enterLastName("Gajjala");
        registerPage.enterEmail("sunilreddy.gajjala@gmail.com");
        registerPage.enterPassword("68080pranil");
        registerPage.enterConfirmPassword("680806pranil");
        registerPage.clickRegister();
        
        // Assert registration success, e.g., by checking URL or a success message
        Assert.assertEquals("Expected URL after successful registration", "https://demowebshop.tricentis.com/success", driver.getCurrentUrl());
    }

    
    public void testRegisterWithEmptyFields() {
        
        registerPage.clickRegister();

        // Assert error message
        String errorMessage = registerPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("First name is required."));
        Assert.assertTrue(errorMessage.contains("Last name is required."));
        Assert.assertTrue(errorMessage.contains("Email is required."));
        Assert.assertTrue(errorMessage.contains("Password is required."));
        Assert.assertTrue(errorMessage.contains("Password is required."));
       
        String lastnameerror=registerPage.Get_LastnameErrorMessage();
        Assert.assertTrue(lastnameerror.contains("Last name is required."));
        
    }

   
    public void testRegisterWithInvalidEmail() {
        
        registerPage.selectGenderMale();
        registerPage.enterFirstName("John");
        registerPage.enterLastName("Doe");
        registerPage.enterEmail("invalid-email");
        registerPage.enterPassword("Password123");
        registerPage.enterConfirmPassword("Password123");
        registerPage.clickRegister();

        // Assert error message
        String errorMessage = registerPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("Wrong email"));

    }

   
    public void testRegisterWithMismatchedPasswords() {
        
        registerPage.selectGenderMale();
        registerPage.enterFirstName("John");
        registerPage.enterLastName("Doe");
        registerPage.enterEmail("john.doe@example.com");
        registerPage.enterPassword("Password123");
        registerPage.enterConfirmPassword("Password321");
        registerPage.clickRegister();

        // Assert error message
        String errorMessage = registerPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("The password and confirmation password do not match."));

        
    }
}
