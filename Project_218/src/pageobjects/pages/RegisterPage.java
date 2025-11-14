
// RegisterPage.
package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage 
{
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    // Selectors
    private By genderMale = By.id("gender-male");
    private By genderFemale = By.id("gender-female");
    private By firstNameInput = By.id("FirstName");
    private By lastNameInput = By.id("LastName");
    private By emailInput = By.id("Email");
    private By passwordInput = By.id("Password");
    private By confirmPasswordInput = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");
    private By errorMessage = By.className("message-error");
    private By LastnameErrorMessage=By.xpath("//span[@for='FirstName']");

    // Actions
    public void selectGenderMale() {
        driver.findElement(genderMale).click();
    }

    public void selectGenderFemale() {
        driver.findElement(genderFemale).click();
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordInput).sendKeys(confirmPassword);
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
    
    public String Get_LastnameErrorMessage()
    {
    	return driver.findElement(LastnameErrorMessage).getText();
    }
}

// RegisterTest.
