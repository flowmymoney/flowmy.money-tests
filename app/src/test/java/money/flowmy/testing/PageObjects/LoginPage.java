package money.flowmy.testing.PageObjects;

import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By loginButton = By.xpath("/html/body/div[1]/div/form/div/div[4]/button");
    private By iForgotThePasswordButton = By.xpath("/html/body/div[1]/div/form/div/div[4]/a");
    private By iDontHaveAnAccountButton = By.xpath("/html/body/div[1]/div/div/a");
    private By errorMessage = By.xpath("/html/body/div[1]/div/form/div/div[1]/div");


    public LoginPage() {
        super("http://dev.flowmy.money/login");
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
