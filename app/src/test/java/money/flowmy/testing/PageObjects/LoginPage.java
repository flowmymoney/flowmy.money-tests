package money.flowmy.testing.PageObjects;

import money.flowmy.testing.Actions.LoginActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginActions {

    public static String url = "http://nginx/login";
    public WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
}
