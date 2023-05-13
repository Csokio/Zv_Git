package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasicPage extends Page{


    public BasicPage()
    {
        super();
    }

    private final String url = "http://demo.seleniumeasy.com/basic-first-form-demo.html";
    public void navigate()
    {
        driver.navigate().to(url);
    }
    //TODO Sum Of Two Numbers
    private final By FIELD_VALUE_A = By.id("value1");
    private final By FIELD_VALUE_B = By.id("value2");
    public void valueA(int a)
    {
        driver.findElement(FIELD_VALUE_A).sendKeys(String.valueOf(a));
    }
    public void valueB(int b)
    {
        driver.findElement(FIELD_VALUE_B).sendKeys(String.valueOf(b));
    }


    public void getValueButton(String functionName)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(functionName);
    }
    private final By DISPLAYED_VALUE = By.id("displayvalue");

    public int getDisplayedValue()
    {
        return Integer.parseInt(driver.findElement(DISPLAYED_VALUE).getText());
    }

    //TODO Two Invalid Inputs

    public void valueStringA(String a)
    {
        driver.findElement(FIELD_VALUE_A).sendKeys(a);
    }
    public void valueStringB(String b)
    {
        driver.findElement(FIELD_VALUE_B).sendKeys(b);
    }

    public String getStringDisplayedValue()
    {
        return driver.findElement(DISPLAYED_VALUE).getText();
    }

    //TODO navigate to Radio Page

    private final By BUTTON_INPUT_FORMS = By.linkText("Input Forms");
    private final By BUTTON_RADIO_DEMO = By.linkText("Radio Buttons Demo");

    public RadioPage goToRadioPage()
    {
        driver.findElement(BUTTON_INPUT_FORMS).click();
        driver.findElement(BUTTON_RADIO_DEMO).click();
        return new RadioPage();
    }

}
