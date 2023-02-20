package money.flowmy.testing.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import money.flowmy.testing.PageObjects.SignUp;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpStepDefinitions {
    private SignUp signUp;

    @After
    public void after() {
        signUp.webDriver.quit();
    }

    @Given("I am on the sign up page")
    public void iAmOnTheSignUpPage() {
        WebDriver webDriver = new ChromeDriver();
        signUp = new SignUp(webDriver);
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
