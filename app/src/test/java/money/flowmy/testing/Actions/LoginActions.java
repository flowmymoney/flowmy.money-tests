package money.flowmy.testing.Actions;

import money.flowmy.testing.Maps.LoginMaps;

public class LoginActions extends LoginMaps {
    public LoginActions fillEmailInput(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public LoginActions fillPasswordInput(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public LoginActions clickLoginButton() {
        loginButton.click();
        return this;
    }

    public LoginActions clickIForgotThePasswordButton() {
        iForgotThePasswordButton.click();
        return this;
    }

    public LoginActions clickIDontHaveAnAccountButton() {
        iDontHaveAnAccountButton.click();
        return this;
    }

    public LoginActions assertErrorMessage(String string) {
        errorMessage.getText().equals(string);
        return this;
    }
}
