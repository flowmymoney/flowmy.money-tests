package money.flowmy.testing.Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageMaps {

    @FindBy(id = "email")
    protected WebElement emailInput;

    @FindBy(id = "password")
    protected WebElement passwordInput;

    @FindBy(xpath = "/html/body/div/div/form/div/div[3]/button")
    protected WebElement loginButton;

    @FindBy(xpath = "/html/body/div[1]/div/form/div/div[4]/a")
    protected WebElement iForgotThePasswordButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/a")
    protected WebElement iDontHaveAnAccountButton;

    @FindBy(xpath = "/html/body/div[1]/div/form/div/div[1]/div")
    protected WebElement errorMessage;
}
