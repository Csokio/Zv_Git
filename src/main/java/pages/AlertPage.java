package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AlertPage extends Page{


    public AlertPage()
    {
        super();
    }

    private final String url = "http://demo.seleniumeasy.com/javascript-alert-box-demo.html";

    public void navigate()
    {
        driver.navigate().to(url);
    }

    //TODO Alert OK Button

    public final By THIRD_PANEL = By.xpath("(//div[@class='panel panel-primary'])[3]");
    private final By TEXT_VISIBLE = By.xpath("//p[@id='prompt-demo']");
    public void scrollIntoView(By xpath)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView", driver.findElement(xpath));
    }

    public void clickAlertButton()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("myPromptFunction()");
    }

    public String getAlertMessage(String name)
    {
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();
        return driver.findElement(TEXT_VISIBLE).getText();
    }

    //TODO Cancel Alert

    public String getAlertMessageCancel(String brother, String sister)
    {
        driver.switchTo().alert().sendKeys(brother);
        driver.switchTo().alert().accept();
        clickAlertButton();
        driver.switchTo().alert().sendKeys(sister);
        driver.switchTo().alert().dismiss();

        return driver.findElement(TEXT_VISIBLE).getText();
    }
}
