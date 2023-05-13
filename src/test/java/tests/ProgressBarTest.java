package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.Page;
import pages.ProgressBarPage;

public class ProgressBarTest{


    @Test
    public void TestProgressBarDownload()
    {
        ProgressBarPage progressBarPage = new ProgressBarPage();
        progressBarPage.navigate();
        progressBarPage.clickDownBtn();

        String expected = "100%";
        String actual = progressBarPage.getDownloadProgress();

        Assertions.assertEquals(expected,actual);
    }

    /*@AfterAll
    public static void Close()
    {
        Page.driver.close();
    }*/

}
