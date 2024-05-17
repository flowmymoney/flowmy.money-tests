package money.flowmy.testing.StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import money.flowmy.testing.PageObjects.BankAccountPage;
import money.flowmy.testing.PageObjects.SignUpPage;
import money.flowmy.testing.Settings.Hooks;
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


    @And("click on save button")
    public void clickOnSaveButton() {
        this.bankAccountPage.clickSaveButton();
    }

    @When("I have a bank account created")
    public void iHaveABankAccountCreated() {
        this.clickOnCreateButton();
        this.fillInTheFieldsNameAccount("Nubank");
        this.selectTheBank("Nu Pagamentos S.A (Nubank)");
        this.selectTheBankAccountType("Conta Corrente");
        this.fillInTheFieldsAgency("1234");
        this.fillInTheFieldsNumber("123456789");
        this.fillInTheFieldsDigit("0");
        this.clickOnSaveButton();
    }

    @And("click on edit button")
    public void clickOnEditButton() {
        this.bankAccountPage.clickActionsButton()
                .clickShowButton()
                .clickEditButton();
    }

    @Given("click on delete button")
    public void clickOnDeleteButton() {
        this.bankAccountPage.webDriver.findElement(By.id("actions")).click(); // Botão de ação
        this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[7]/span/div/form/button")).click(); // Botão de deletar
    }

    @Then("the bank account must be deleted")
    public void theBankAccountMustBeDeleted() {
        Assert.assertThrows(org.openqa.selenium.NoSuchElementException.class, () -> {
            this.bankAccountPage.webDriver.findElement(By.xpath("//table/tbody/tr"));
        });
    }

    @And("fill in the fields nameAccount {}")
    public void fillInTheFieldsNameAccount(String string) {
        this.bankAccountPage.fillBankAccountNameInput(string);
    }

    @And("select the bank {}")
    public void selectTheBank(String string) {
        this.bankAccountPage.selectOptionBankAccountSelect(string);
    }

    @And("select the type bank account {}")
    public void selectTheBankAccountType(String string) {
        this.bankAccountPage.selectOptionBankAccountTypeSelect(string);
    }

    @And("fill in the fields agency {}")
    public void fillInTheFieldsAgency(String string) {
        this.bankAccountPage.fillBankAccountAgencyInput(string);
    }

    @And("fill in the fields number {}")
    public void fillInTheFieldsNumber(String string) {
        this.bankAccountPage.fillBankAccountNumberInput(string);
    }

    @And("fill in the fields digit {}")
    public void fillInTheFieldsDigit(String string) {
        this.bankAccountPage.fillBankAccountDigitInput(string);
    }

    @Then("the bank account must be saved with {}, {}, {}, {}, {}")
    public void theBankAccountMustBeSavedWith(String bank, String bankAccountType, String agency, String number, String digit) {
        Assert.assertEquals(bank, this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[1]")).getText());
        Assert.assertEquals(bankAccountType, this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[2]")).getText());
        Assert.assertEquals(agency, this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[3]")).getText());
        Assert.assertEquals(number, this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[4]")).getText());
        Assert.assertEquals(digit, this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[5]")).getText());
        Assert.assertEquals("R$ 0,00", this.bankAccountPage.webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[6]")).getText());
    }
}
