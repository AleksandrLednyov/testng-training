package date_serializer_service_test;

import date_serializer_service.DateSerializerService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;

@Test(testName = "Date Serializer")
public class DateSerializerServiceUnitTest {
    private DateSerializerService toTest;

    @BeforeClass
    public void beforeClass() {
        toTest = new DateSerializerService();
    }

    @Test(expectedExceptions = { NullPointerException.class },
    groups = "test groups")
    void givenNullDate_whenSerializeDate_thenThrowsException() {
        Date dateToTest = null;

        toTest.serializeDate(dateToTest, "yyyy/MM/dd HH:mm:ss.SSS");
    }
}
