package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;

public class DualListPage extends Page{


    public DualListPage()
    {
        super();
    }

    private final String url = "http://demo.seleniumeasy.com/jquery-dual-list-box-demo.html";

    public void navigate()
    {
        driver.navigate().to(url);
    }
    //TODO Select add All
    private final By BUTTON_ADD_ALL = By.xpath("//button[@class=\"pAddAll btn btn-primary btn-sm\"]");
    private final By SELECT_RESULT_ITEMS = By.xpath("//select[@class='form-control pickListSelect pickListResult']");

    public int numberOfItemsSelected() throws InterruptedException
    {
        driver.findElement(BUTTON_ADD_ALL).click();
        Thread.sleep(1500);
        Select select = new Select(driver.findElement(SELECT_RESULT_ITEMS));
        return select.getOptions().size();
    }

    //TODO Select add Single Item

    private final By BUTTON_ADD = By.xpath("//button[@class='pAdd btn btn-primary btn-sm']");
    private final By SELECT_ORIGINAL_ITEMS = By.xpath("//select[@class='form-control pickListSelect pickData']");

    public HashMap<Integer, Boolean> selectSingleItem(String name)
    {
        HashMap<Integer, Boolean> resultMap = new HashMap<>();
        Select select = new Select(driver.findElement(SELECT_ORIGINAL_ITEMS));
        select.selectByVisibleText(name);
        driver.findElement(BUTTON_ADD).click();
        Integer key = select.getOptions().size();

        Select newSelect = new Select(driver.findElement(SELECT_RESULT_ITEMS));
        List<WebElement> selectValues = newSelect.getOptions();

        boolean value = selectValues.get(0).getText().equals(name);

        resultMap.put(key, value);
        return resultMap;
    }
}
