package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BasicPage;

public class InputFieldTest{


    @Test
    public void TestSumTwoNumbers()
    {
        BasicPage basicPage = new BasicPage();
        basicPage.navigate();

        int a = 5223;
        int b = 6318;

        basicPage.valueA(a);
        basicPage.valueB(b);
        basicPage.getValueButton("return total()");

        int expected = 11541;
        int actual = basicPage.getDisplayedValue();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestSumTwoInvalidInputs()
    {
        BasicPage basicPage = new BasicPage();
        basicPage.navigate();

        String a = "Bonnie";
        String b = "Clyde";

        basicPage.valueStringA(a);
        basicPage.valueStringB(b);

        basicPage.getValueButton("return total()");

        String expected = "NaN";
        String actual = basicPage.getStringDisplayedValue();

        Assertions.assertEquals(expected,actual);
    }
}
