package simpleTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SecondSimpleTest {

    int number;

    @BeforeClass
    public void setup() {
        number = 11;
    }

    @AfterClass
    public void tearDown() {
        number = 0;
    }

    @Test
    public void givenNumber_whenNotEven_thenFalse() {
        assertFalse(number % 2 == 0);
    }
}
