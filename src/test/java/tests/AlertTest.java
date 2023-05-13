package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.AlertPage;

public class AlertTest {


    @Test
    public void TestSubmitValidInput()
    {
        AlertPage alertPage = new AlertPage();
        alertPage.navigate();
        alertPage.scrollIntoView(alertPage.THIRD_PANEL);
        alertPage.clickAlertButton();

        String name = "John Wick";

        String expected = "You have entered 'John Wick' !";
        String actual = alertPage.getAlertMessage(name);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestInputCancel()
    {
        AlertPage alertPage = new AlertPage();
        alertPage.navigate();
        alertPage.scrollIntoView(alertPage.THIRD_PANEL);
        alertPage.clickAlertButton();

        String brother = "Luke";
        String sister = "Leila";

        String expected = "You have entered 'Luke' !";
        String actual = alertPage.getAlertMessageCancel(brother, sister);

        Assertions.assertEquals(expected, actual);
    }


}
