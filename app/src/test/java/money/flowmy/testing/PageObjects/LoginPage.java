package money.flowmy.testing.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public String url = "http://dev.flowmy.money/login";
    public WebDriver webDriver;


    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "/html/body/div[1]/div/form/div/div[4]/button")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div[1]/div/form/div/div[4]/a")
    private WebElement iForgotThePasswordButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/a")
    private WebElement iDontHaveAnAccountButton;

    @FindBy(xpath = "/html/body/div[1]/div/form/div/div[1]/div")
    private WebElement errorMessage;

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
