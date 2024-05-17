package money.flowmy.testing.Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpMaps {

    @FindBy(id = "first_name")
    protected WebElement nameInput;

    @FindBy(id = "last_name")
    protected WebElement lastNameInput;

    @FindBy(id = "email")
    protected WebElement emailInput;

    @FindBy(id = "password")
    protected WebElement passwordInput;

    @FindBy(id = "password_confirmation")
    protected WebElement passwordConfirmationInput;

    @FindBy(xpath = "/html/body/div/div/form/div/div[6]/input")
    protected WebElement signUpButton;
}
