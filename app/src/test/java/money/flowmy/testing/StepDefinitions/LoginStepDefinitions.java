package money.flowmy.testing.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import money.flowmy.testing.PageObjects.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class LoginStepDefinitions {
    private LoginPage loginPage;

    @Before
    public void beforeEach() {
        this.loginPage = new LoginPage();
    }

    @After
    public void afterEach(Scenario scenario) {
        try {
            File file = ((TakesScreenshot) loginPage.webDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("target/screenshots/" + scenario.getId() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.loginPage.afterEach();
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
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
