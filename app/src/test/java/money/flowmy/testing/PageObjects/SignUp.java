package money.flowmy.testing.PageObjects;

import org.openqa.selenium.By;

public class SignUp extends PageObject {

    public String url = "http://dev.flowmy.money/register";
    private By nameInput = By.id("first_name");
    private By lastNameInput = By.id("last_name");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By passwordConfirmationInput = By.id("password_confirmation");
    private By signUpButton = By.xpath("/html/body/div[1]/div/form/div/div[7]/input");

    public SignUp() {
        super("http://dev.flowmy.money/register");
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
