package simpleTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FirstSimpleTest {

    int number;

    @BeforeClass
    public void setup() {
        number = 12;
    }

    @AfterClass
    public void tearDown() {
        number = 0;
    }

    @Test(groups = "test groups")
    public int givenNumber_whenEven_thenTrue() {
        assertTrue(number % 2 == 0);
        return 1;
    }

    @Test(groups = "test groups")
    public void givenNumber_whenEven_thenFalse() {
        assertFalse(number % 2 == 1);
    }
}
