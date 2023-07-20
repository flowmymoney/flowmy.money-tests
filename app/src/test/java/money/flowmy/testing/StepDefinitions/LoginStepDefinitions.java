package money.flowmy.testing.StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import money.flowmy.testing.PageObjects.LoginPage;
import money.flowmy.testing.PageObjects.SignUpPage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {
    private LoginPage loginPage = new LoginPage(Hooks.getWebDriver());

    String email = Faker.instance().internet().emailAddress();
    String password = Faker.instance().internet().password();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        this.loginPage.webDriver.navigate().to(this.loginPage.url);
    }

    @When("type a valid email in email field")
    public void typeInEmailField() {
        this.loginPage.fillEmailInput(email);
    }

    @And("type a valid password in password field")
    public void typeInPasswordField() {
        this.loginPage.fillPasswordInput(password);
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        this.loginPage.clickLoginButton();
    }

    @Then("I should see the authenticated user's main screen")
    public void iShouldSeeTheAuthenticatedUserSMainScreen() {
        Assert.assertEquals("http://localhost/", this.loginPage.webDriver.getCurrentUrl());
    }

    @Then("I should see {string}")
    public void iShouldSee(String string) {
        this.loginPage.assertErrorMessage(string);
    }

    @And("I have a valid account")
    public void iHaveAValidAccount() {
        SignUpPage signUpPage = new SignUpPage(new ChromeDriver());
        signUpPage.webDriver.navigate().to(SignUpPage.url);

        signUpPage.fillNameInput(Faker.instance().name().fullName())
                .fillLastNameInput(Faker.instance().name().lastName())
                .fillEmailInput(email)
                .fillPasswordInput(password)
                .fillPasswordConfirmationInput(password)
                .clickSignUpButton()
                .webDriver.quit();
    }
}
