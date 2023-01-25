package end.to.end.testing.PageObjects;

import org.openqa.selenium.By;

public class HomeForUnauthenticatedUsers extends PageObject {

    private final By Register = By.xpath("/html/body/header/div/div/div[2]/a");
    private final By Login = By.xpath("/html/body/header/div/div/div[1]/a");

    public HomeForUnauthenticatedUsers() {
        super("http://dev.flowmy.money/");
    }

    public void clickRegister() {
        this.webDriver.findElement(this.Register).click();
    }

    public void clickLogin() {
        this.webDriver.findElement(this.Login).click();
    }
}
