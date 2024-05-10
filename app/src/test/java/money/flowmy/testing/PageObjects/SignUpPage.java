package money.flowmy.testing.PageObjects;

import money.flowmy.testing.Maps.SignUpPageMaps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends SignUpPageMaps {

    public static String url = "http://nginx/register";
    public WebDriver webDriver;

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
