package money.flowmy.testing.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static WebDriver webDriver;

    @Before
    public static void before() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @After
    public static void after() {
        webDriver.quit();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }
}