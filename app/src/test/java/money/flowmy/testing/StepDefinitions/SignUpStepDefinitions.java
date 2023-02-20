package money.flowmy.testing.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import money.flowmy.testing.PageObjects.SignUpPage;
import org.junit.Assert;

public class SignUpStepDefinitions {
    private SignUpPage signUp = new SignUpPage(Hooks.getWebDriver());

    @Given("I am on the sign up page")
    public void iAmOnTheSignUpPage() {
        signUp.webDriver.navigate().to(signUp.url);
    }

    @When("I fill name with {string}")
    public void iFillNameWith(String string) {
        signUp.fillNameInput(string);
    }

    @And("I fill lastname with {string}")
    public void iFillLastnameWith(String string) {
        signUp.fillLastNameInput(string);
    }

    @And("I fill email with {string}")
    public void iFillEmailWith(String string) {
        signUp.fillEmailInput(string);
    }

    @And("I fill password with {string}")
    public void iFillPasswordWith(String string) {
        signUp.fillPasswordInput(string);
    }

    @And("I fill password confirmation with {string}")
    public void iFillPasswordConfirmationWith(String string) {
        signUp.fillPasswordConfirmationInput(string);
    }

    @When("I click on Sign up")
    public void iClickOnSignUp() {
        signUp.clickSignUpButton();
    }

    @Then("I must be authenticated")
    public void iMustBeAuthenticated() {
        Assert.assertEquals("http://dev.flowmy.money/", signUp.webDriver.getCurrentUrl());
        Assert.assertEquals("Dashboard", signUp.webDriver.getTitle());
    }

    @Then("I must not be authenticated")
    public void iMustNotBeAuthenticated() {
        Assert.assertEquals("http://dev.flowmy.money/register", signUp.webDriver.getCurrentUrl());
        Assert.assertEquals("Cadastro", signUp.webDriver.getTitle());
    }
}
