package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;

import java.time.Duration;

/*public class BaseTest {

    public WebDriver driver;
    protected WebDriverWait wait;

    @BeforeAll
    public static void Setup()
    {
        Page page = new Page();

    }

    @AfterAll
    public static void quitDriver()
    {
        Page.driver.quit();
    }

}*/
