package money.flowmy.testing.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public String url = "http://dev.flowmy.money/login";
    public WebDriver webDriver;

    private final By emailInput = By.id("email");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.xpath("/html/body/div[1]/div/form/div/div[4]/button");
    private final By iForgotThePasswordButton = By.xpath("/html/body/div[1]/div/form/div/div[4]/a");
    private final By iDontHaveAnAccountButton = By.xpath("/html/body/div[1]/div/div/a");
    private final By errorMessage = By.xpath("/html/body/div[1]/div/form/div/div[1]/div");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriver.manage().window().maximize();
        PageFactory.initElements(webDriver, this);
    }

    public void fillEmailInput(String email) {
        this.webDriver.findElement(emailInput).sendKeys(email);
    }

    public void fillPasswordInput(String password) {
        this.webDriver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        this.webDriver.findElement(loginButton).click();
    }

    public void clickIForgotThePasswordButton() {
        this.webDriver.findElement(iForgotThePasswordButton).click();
    }

    public void clickIDontHaveAnAccountButton() {
        this.webDriver.findElement(iDontHaveAnAccountButton).click();
    }

    public void assertErrorMessage(String string) {
        this.webDriver.findElement(errorMessage).getText().equals(string);
    }
}
