package money.flowmy.testing.Actions;

import money.flowmy.testing.Maps.BankAccountMaps;
import org.openqa.selenium.support.ui.Select;

public class BankAccountActions extends BankAccountMaps {

    public BankAccountActions clickCreateButton() {
        this.createButton.click();
        return this;
    }

    public BankAccountActions clickSaveButton() {
        this.saveButton.click();
        return this;
    }

    public BankAccountActions clickActionsButton() {
        this.actions.click();
        return this;
    }

    public BankAccountActions clickShowButton() {
        this.show.click();
        return this;
    }

    public BankAccountActions clickEditButton() {
        this.edit.click();
        return this;
    }

    public BankAccountActions clickGoBackButton() {
        this.goBackButton.click();
        return this;
    }

    public BankAccountActions fillBankAccountNameInput(CharSequence bankAccountName) {
        this.bankAccountNameInput.clear();
        this.bankAccountNameInput.sendKeys(bankAccountName);
        return this;
    }

    public BankAccountActions selectOptionBankAccountSelect(String text) {
        Select select = new Select(bankAccountSelect);
        select.selectByVisibleText(text);
        return this;
    }

    public BankAccountActions selectOptionBankAccountTypeSelect(String text) {
        Select select = new Select(bankAccountTypeSelect);
        select.selectByVisibleText(text);
        return this;
    }

    public BankAccountActions fillBankAccountAgencyInput(CharSequence bankAccountAgency) {
        this.bankAccountAgencyInput.clear();
        this.bankAccountAgencyInput.sendKeys(bankAccountAgency);
        return this;
    }

    public BankAccountActions fillBankAccountNumberInput(CharSequence bankAccountNumber) {
        this.bankAccountNumberInput.clear();
        this.bankAccountNumberInput.sendKeys(bankAccountNumber);
        return this;
    }

    public BankAccountActions fillBankAccountDigitInput(CharSequence bankAccountDigit) {
        this.bankAccountDigitInput.clear();
        this.bankAccountDigitInput.sendKeys(bankAccountDigit);
        return this;
    }

}
