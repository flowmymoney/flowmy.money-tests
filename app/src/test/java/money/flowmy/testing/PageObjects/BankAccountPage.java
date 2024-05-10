package money.flowmy.testing.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BankAccountPage {
    public static String url = "http://nginx/financial/bankAccount";
    public WebDriver webDriver;

    @FindBy(id = "create")
    private WebElement createButton;

    @FindBy(id = "save")
    private WebElement saveButton;

    @FindBy(id = "goBack")
    private WebElement goBackButton;

    @FindBy(id = "actions")
    private WebElement actions;

    @FindBy(id = "show")
    private WebElement show;

    @FindBy(id = "edit")
    private WebElement edit;

    @FindBy(name = "surname")
    private WebElement bankAccountNameInput;

    @FindBy(name = "bank_id")
    private WebElement bankAccountSelect;

    @FindBy(name = "bank_account_type_id")
    public WebElement bankAccountTypeSelect;

    @FindBy(name = "agency")
    private WebElement bankAccountAgencyInput;

    @FindBy(name = "number")
    private WebElement bankAccountNumberInput;

    @FindBy(name = "digit")
    private WebElement bankAccountDigitInput;

    public BankAccountPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public BankAccountPage clickCreateButton() {
        this.createButton.click();
        return this;
    }

    public BankAccountPage clickSaveButton() {
        this.saveButton.click();
        return this;
    }

    public BankAccountPage clickActionsButton() {
        this.actions.click();
        return this;
    }

    public BankAccountPage clickShowButton() {
        this.show.click();
        return this;
    }

    public BankAccountPage clickEditButton() {
        this.edit.click();
        return this;
    }

    public BankAccountPage clickGoBackButton() {
        this.goBackButton.click();
        return this;
    }

    public BankAccountPage fillBankAccountNameInput(CharSequence bankAccountName) {
        this.bankAccountNameInput.clear();
        this.bankAccountNameInput.sendKeys(bankAccountName);
        return this;
    }

    public BankAccountPage selectOptionBankAccountSelect(String text) {
        Select select = new Select(bankAccountSelect);
        select.selectByVisibleText(text);
        return this;
    }

    public BankAccountPage selectOptionBankAccountTypeSelect(String text) {
        Select select = new Select(bankAccountTypeSelect);
        select.selectByVisibleText(text);
        return this;
    }

    public BankAccountPage fillBankAccountAgencyInput(CharSequence bankAccountAgency) {
        this.bankAccountAgencyInput.clear();
        this.bankAccountAgencyInput.sendKeys(bankAccountAgency);
        return this;
    }

    public BankAccountPage fillBankAccountNumberInput(CharSequence bankAccountNumber) {
        this.bankAccountNumberInput.clear();
        this.bankAccountNumberInput.sendKeys(bankAccountNumber);
        return this;
    }

    public BankAccountPage fillBankAccountDigitInput(CharSequence bankAccountDigit) {
        this.bankAccountDigitInput.clear();
        this.bankAccountDigitInput.sendKeys(bankAccountDigit);
        return this;
    }

}
