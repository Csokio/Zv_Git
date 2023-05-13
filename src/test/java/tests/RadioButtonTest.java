package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BasicPage;
import pages.RadioPage;

public class RadioButtonTest{


    @Test
    public void TestSingleCheckedButton()
    {
        BasicPage basicPage = new BasicPage();
        basicPage.navigate();
        RadioPage radioPage = basicPage.goToRadioPage();

        String expected = "Radio button 'Male' is checked";
        String actual = radioPage.compareTextVisible();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void TestMultipleCheckedButton()
    {
        RadioPage radioPage = new RadioPage();
        radioPage.navigate();
        radioPage.scrollIntoView(radioPage.AGE_GROUP);

        String expected = "Sex : Male\n" +
                "Age group: 5 - 15";
        String actual = radioPage.compareAgeAndSexVisible();

        Assertions.assertEquals(expected, actual);
    }
}
