package money.flowmy.testing.Actions;

import money.flowmy.testing.Maps.SignUpMaps;

public class SignUpActions extends SignUpMaps {

    public SignUpActions fillNameInput(String name) {
        nameInput.sendKeys(name);
        return this;
    }

    public SignUpActions fillLastNameInput(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public SignUpActions fillEmailInput(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public SignUpActions fillPasswordInput(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public SignUpActions fillPasswordConfirmationInput(String passwordConfirmation) {
        passwordConfirmationInput.sendKeys(passwordConfirmation);
        return this;
    }

    public SignUpActions clickSignUpButton() {
        signUpButton.click();
        return this;
    }
}
