package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.DualListPage;

import java.util.HashMap;

public class DualListBoxTest{


    @Test
    public void TestAddSingleElement()
    {
        DualListPage dualListPage = new DualListPage();
        dualListPage.navigate();

        int expectedNUmber = 14;
        HashMap<Integer, Boolean> expected = new HashMap<>();
        expected.put(expectedNUmber, true);

        String name = "Julia";
        HashMap<Integer, Boolean> actual = dualListPage.selectSingleItem(name);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestAddAllElementButton() throws InterruptedException
    {
        DualListPage dualListPage = new DualListPage();
        dualListPage.navigate();

        int expected = 15;
        int actual = dualListPage.numberOfItemsSelected();

        Assertions.assertEquals(expected, actual);
    }

}
