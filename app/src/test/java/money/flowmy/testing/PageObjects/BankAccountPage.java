package money.flowmy.testing.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BankAccountPage {
    public static String url = "http://localhost/financial/bankAccount";
    public WebDriver webDriver;

    @FindBy(xpath = "//*[@id=\"create\"]")
    private WebElement createButton;

    @FindBy(id = "save")
    private WebElement saveButton;

    @FindBy(id = "goBack")
    private WebElement goBackButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/form/div[2]/div/div/div/div[1]/input")
    private WebElement bankAccountNameInput;

    @FindBy(name = "bank_id")
    private WebElement bankAccountSelect;

    @FindBy(name = "bank_account_type_id")
    private WebElement bankAccountTypeSelect;

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

    public BankAccountPage clickGoBackButton() {
        this.goBackButton.click();
        return this;
    }

    public BankAccountPage fillBankAccountNameInput(String bankAccountName) {
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

    public BankAccountPage fillBankAccountAgencyInput(String bankAccountAgency) {
        this.bankAccountAgencyInput.sendKeys(bankAccountAgency);
        return this;
    }

    public BankAccountPage fillBankAccountNumberInput(String bankAccountNumber) {
        this.bankAccountNumberInput.sendKeys(bankAccountNumber);
        return this;
    }

    public BankAccountPage fillBankAccountDigitInput(String bankAccountDigit) {
        this.bankAccountDigitInput.sendKeys(bankAccountDigit);
        return this;
    }

}
