package money.flowmy.testing.Actions;

import money.flowmy.testing.Maps.LoginMaps;

public class LoginActions extends LoginMaps {
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
