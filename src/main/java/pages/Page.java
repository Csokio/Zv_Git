package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {

    public static WebDriver driver;

    //WebDriverWait wait;

    public Page() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("ignore-certificate-errors");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-extensions");
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("start-maximized");
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
    }


    protected void scrollIntoView(By xpath)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView", driver.findElement(xpath));
    }
}
