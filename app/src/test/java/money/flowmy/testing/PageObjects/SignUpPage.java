package money.flowmy.testing.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public static String url = "http://nginx/register";
    public WebDriver webDriver;

    @FindBy(id = "first_name")
    public WebElement nameInput;

    @FindBy(id = "last_name")
    public WebElement lastNameInput;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "password_confirmation")
    public WebElement passwordConfirmationInput;

    @FindBy(xpath = "/html/body/div/div/form/div/div[6]/input")
    public WebElement signUpButton;

    public SignUpPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public SignUpPage fillNameInput(String name) {
        nameInput.sendKeys(name);
        return this;
    }

    public SignUpPage fillLastNameInput(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public SignUpPage fillEmailInput(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public SignUpPage fillPasswordInput(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public SignUpPage fillPasswordConfirmationInput(String passwordConfirmation) {
        passwordConfirmationInput.sendKeys(passwordConfirmation);
        return this;
    }

    public SignUpPage clickSignUpButton() {
        signUpButton.click();
        return this;
    }
}
