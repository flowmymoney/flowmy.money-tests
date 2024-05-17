package money.flowmy.testing.StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import money.flowmy.testing.PageObjects.SignUpPage;
import money.flowmy.testing.Settings.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SignUpStepDefinitions {
    private final SignUpPage signUp = new SignUpPage(Hooks.getWebDriver());

    @Given("I fill out the form correctly")
    public void iFillOutTheFormCorrectly() {
        String string = Faker.instance().internet().password();

        signUp.fillNameInput(Faker.instance().name().firstName())
                .fillLastNameInput(Faker.instance().name().lastName())
                .fillEmailInput(Faker.instance().internet().emailAddress())
                .fillPasswordInput(string)
                .fillPasswordConfirmationInput(string);
    }

    @Given("I am on the sign up page")
    public void iAmOnTheSignUpPage() {
        signUp.webDriver.navigate().to(SignUpPage.url);
    }

    @When("I fill name with {string}")
    public void iFillNameWith(String string) {
        Faker.instance().name().firstName();
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
        Assert.assertEquals("http://nginx/", signUp.webDriver.getCurrentUrl());
        Assert.assertEquals("Dashboard", signUp.webDriver.getTitle());
    }

    @Then("I must not be authenticated")
    public void iMustNotBeAuthenticated() {
        Assert.assertEquals("http://nginx/register", signUp.webDriver.getCurrentUrl());
        Assert.assertEquals("Cadastro", signUp.webDriver.getTitle());
    }

    @And("I should see an error message saying {string}")
    public void iShouldSeeAnErrorMessageSaying(String string) {
        try {
            String message = signUp.webDriver.findElement(By.className("invalid-feedback")).getText();
            Assert.assertEquals(message, string);
        } catch (Exception e) {
            Assert.fail("Error message not found");
        }
    }
}