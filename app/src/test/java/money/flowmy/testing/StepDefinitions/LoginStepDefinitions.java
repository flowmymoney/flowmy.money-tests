package money.flowmy.testing.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import money.flowmy.testing.PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {
    private LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        WebDriver webDriver = new ChromeDriver();
        this.loginPage = new LoginPage(webDriver);
        this.loginPage.webDriver.navigate().to(this.loginPage.url);
    }

    @When("type {string} in email field")
    public void typeInEmailField(String string) {
        this.loginPage.fillEmailInput(string);
    }

    @And("type {string} in password field")
    public void typeInPasswordField(String string) {
        this.loginPage.fillPasswordInput(string);
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        this.loginPage.clickLoginButton();
    }

    @Then("I should see the authenticated user's main screen")
    public void iShouldSeeTheAuthenticatedUserSMainScreen() {
    }

    @Then("I should see {string}")
    public void iShouldSee(String string) {
        this.loginPage.assertErrorMessage(string);
    }
}
