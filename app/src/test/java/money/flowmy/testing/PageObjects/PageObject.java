package money.flowmy.testing.PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageObject {
    public WebDriver webDriver;
    private final String url;

    public PageObject(String url) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless --disable-gpu");
        WebDriverManager.chromedriver().setup();
        this.url = url;
        this.webDriver = new ChromeDriver();
        this.webDriver.manage().window().maximize();
    }

    public void afterEach() {
        this.webDriver.quit();
    }
}
