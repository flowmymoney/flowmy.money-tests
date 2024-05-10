package money.flowmy.testing.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    private static WebDriver webDriver;

    @Before
    public static void before() throws MalformedURLException {

        URL url = new URL("http://localhost:4444/wd/hub");
        ChromeOptions options = new ChromeOptions();

        webDriver = new RemoteWebDriver(url, options);
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