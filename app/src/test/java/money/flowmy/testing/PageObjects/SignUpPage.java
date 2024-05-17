package money.flowmy.testing.PageObjects;

import money.flowmy.testing.Actions.SignUpActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends SignUpActions {

    public static String url = "http://nginx/register";
    public WebDriver webDriver;

    public SignUpPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
}
