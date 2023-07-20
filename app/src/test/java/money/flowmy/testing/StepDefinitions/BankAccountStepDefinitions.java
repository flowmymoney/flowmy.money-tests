package money.flowmy.testing.StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import money.flowmy.testing.PageObjects.BankAccountPage;
import money.flowmy.testing.PageObjects.SignUpPage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BankAccountStepDefinitions {
    BankAccountPage bankAccountPage;

    @When("I access the bank account index")
    public void iAccessTheBankAccountIndex() {
        SignUpPage signUpPage = new SignUpPage(Hooks.getWebDriver());
        signUpPage.webDriver.navigate().to(SignUpPage.url);

        String email = Faker.instance().internet().emailAddress();
        String password = Faker.instance().internet().password();

        signUpPage.fillNameInput(Faker.instance().name().fullName())
                .fillLastNameInput(Faker.instance().name().lastName())
                .fillEmailInput(email)
                .fillPasswordInput(password)
                .fillPasswordConfirmationInput(password)
                .clickSignUpButton();

        this.bankAccountPage = new BankAccountPage(signUpPage.webDriver);
        this.bankAccountPage.webDriver.navigate().to(BankAccountPage.url);
    }

    @And("click on create button")
    public void clickOnCreateButton() {
        this.bankAccountPage.clickCreateButton();
    }

    @And("fill in the fields with valid information")
    public void fillInTheFieldsWithValidInformation() {
        this.bankAccountPage.fillBankAccountNameInput("Nubank")
                .selectOptionBankAccountSelect("Nu Pagamentos S.A (Nubank)")
                .selectOptionBankAccountTypeSelect("Conta Corrente")
                .fillBankAccountAgencyInput("123")
                .fillBankAccountNumberInput("123456789")
                .fillBankAccountDigitInput("0");
    }

    @And("click on save button")
    public void clickOnSaveButton() {
        this.bankAccountPage.clickSaveButton();
    }

    @Then("the bank account must be saved")
    public void theBankAccountMustBeSaved() {
        Assert.assertEquals("Nu Pagamentos S.A (Nubank)", this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[1]")).getText());
        Assert.assertEquals("Conta Corrente", this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[2]")).getText());
        Assert.assertEquals("123", this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[3]")).getText());
        Assert.assertEquals("123456789", this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[4]")).getText());
        Assert.assertEquals("0", this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[5]")).getText());
    }
}
