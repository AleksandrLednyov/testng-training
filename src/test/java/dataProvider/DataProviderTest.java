package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                {"Cedric", 36},
                {"Anne",37}
        };
    }

    @Test(dataProvider = "test1")
    public void verifyData1(String n1, int n2) {
        System.out.println(n1 + " " + n2);
    }
}
