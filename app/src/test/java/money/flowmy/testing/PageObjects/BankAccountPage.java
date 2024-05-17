package money.flowmy.testing.PageObjects;

import money.flowmy.testing.Actions.BankAccountActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BankAccountPage extends BankAccountActions {

    public static String url = "http://nginx/financial/bankAccount";
    public WebDriver webDriver;

    public BankAccountPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
}