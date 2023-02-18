package money.flowmy.testing.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUp {

    public String url = "http://dev.flowmy.money/register";
    public WebDriver webDriver;

    private final By nameInput = By.id("first_name");
    private final By lastNameInput = By.id("last_name");
    private final By emailInput = By.id("email");
    private final By passwordInput = By.id("password");
    private final By passwordConfirmationInput = By.id("password_confirmation");
    private final By signUpButton = By.xpath("/html/body/div[1]/div/form/div/div[7]/input");

    public SignUp(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriver.manage().window().maximize();
        PageFactory.initElements(webDriver, this);
    }

    public void fillNameInput(String name) {
        this.webDriver.findElement(nameInput).sendKeys(name);
    }

    public void fillLastNameInput(String lastName) {
        this.webDriver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void fillEmailInput(String email) {
        this.webDriver.findElement(emailInput).sendKeys(email);
    }

    public void fillPasswordInput(String password) {
        this.webDriver.findElement(passwordInput).sendKeys(password);
    }

    public void fillPasswordConfirmationInput(String passwordConfirmation) {
        this.webDriver.findElement(passwordConfirmationInput).sendKeys(passwordConfirmation);
    }

    public void clickSignUpButton() {
        this.webDriver.findElement(signUpButton).click();
    }
}
