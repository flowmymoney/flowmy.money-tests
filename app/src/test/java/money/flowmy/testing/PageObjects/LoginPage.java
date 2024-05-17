package money.flowmy.testing.PageObjects;

import money.flowmy.testing.Maps.LoginMaps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginMaps {

    public String url = "http://nginx/login";
    public WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void fillEmailInput(String email) {
        emailInput.sendKeys(email);
    }

    public void fillPasswordInput(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickIForgotThePasswordButton() {
        iForgotThePasswordButton.click();
    }

    public void clickIDontHaveAnAccountButton() {
        iDontHaveAnAccountButton.click();
    }

    public void assertErrorMessage(String string) {
        errorMessage.getText().equals(string);
    }
}
