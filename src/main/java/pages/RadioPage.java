package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RadioPage extends Page{

    public RadioPage()
    {
        super();
    }

    private final String url = "http://demo.seleniumeasy.com/basic-radiobutton-demo.html";

    //TODO Test Single Check Button
    private final By BUTTON_MALE = By.xpath("(//div[@class='panel panel-default']//input[@value='Male'])[1]");
    private final By BUTTON_CHECK = By.id("buttoncheck");
    private final By TEXT_VISIBLE= By.xpath("(//button[@id='buttoncheck']/following::p)[1]");

    public String compareTextVisible()
    {
        driver.findElement(BUTTON_MALE).click();
        driver.findElement(BUTTON_CHECK).click();
        return driver.findElement(TEXT_VISIBLE).getText();
    }

    //TODO Test Multiple Check Button

    public void navigate()
    {
        driver.navigate().to(url);
    }


    private final By BUTTON_MALE_SECOND = By.xpath("(//div[@class='panel panel-default']//input[@value='Male'])[2]");
    public final By AGE_GROUP = By.xpath("//input[@value='5 - 15']");

    private final By DISPLAYED_VALUES = By.xpath("//p[@class=\"groupradiobutton\"]");

    public void scrollIntoView(By xpath)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView", driver.findElement(xpath));
    }

    public String compareAgeAndSexVisible()
    {
        driver.findElement(BUTTON_MALE_SECOND).click();
        driver.findElement(AGE_GROUP).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("getValues();");

        return driver.findElement(DISPLAYED_VALUES).getText();

    }


}
