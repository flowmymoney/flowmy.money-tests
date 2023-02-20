package money.flowmy.testing.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public String url = "http://dev.flowmy.money/register";
    public WebDriver webDriver;

    @FindBy(id = "first_name")
    private WebElement nameInput;

    @FindBy(id = "last_name")
    private WebElement lastNameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "password_confirmation")
    private WebElement passwordConfirmationInput;

    @FindBy(xpath = "/html/body/div[1]/div/form/div/div[7]/input")
    private WebElement signUpButton;

    public SignUpPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void fillNameInput(String name) {
        nameInput.sendKeys(name);
    }

    public void fillLastNameInput(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void fillEmailInput(String email) {
        emailInput.sendKeys(email);
    }

    public void fillPasswordInput(String password) {
        passwordInput.sendKeys(password);
    }

    public void fillPasswordConfirmationInput(String passwordConfirmation) {
        passwordConfirmationInput.sendKeys(passwordConfirmation);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }
}
