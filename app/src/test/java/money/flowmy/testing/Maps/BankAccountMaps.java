package money.flowmy.testing.Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankAccountMaps {

    @FindBy(id = "create")
    protected WebElement createButton;

    @FindBy(id = "save")
    protected WebElement saveButton;

    @FindBy(id = "goBack")
    protected WebElement goBackButton;

    @FindBy(id = "actions")
    protected WebElement actions;

    @FindBy(id = "show")
    protected WebElement show;

    @FindBy(id = "edit")
    protected WebElement edit;

    @FindBy(name = "surname")
    protected WebElement bankAccountNameInput;

    @FindBy(name = "bank_id")
    protected WebElement bankAccountSelect;

    @FindBy(name = "bank_account_type_id")
    protected WebElement bankAccountTypeSelect;

    @FindBy(name = "agency")
    protected WebElement bankAccountAgencyInput;

    @FindBy(name = "number")
    protected WebElement bankAccountNumberInput;

    @FindBy(name = "digit")
    protected WebElement bankAccountDigitInput;
}
