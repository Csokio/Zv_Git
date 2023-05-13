package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBarPage extends Page{

    public ProgressBarPage()
    {
        super();
    }

    private final String url = "http://demo.seleniumeasy.com/bootstrap-download-progress-demo.html";

    public void navigate()
    {
        driver.navigate().to(url);
    }

    private final By downBtn = By.id("cricle-btn");

    public void clickDownBtn()
    {
        driver.findElement(downBtn).click();
    }

    private final By percentTxt = By.xpath("//div[@class='percenttext']");

    public String getDownloadProgress()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(percentTxt, "100%"));
        return driver.findElement(percentTxt).getText();
    }
}
