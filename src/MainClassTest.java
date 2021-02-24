import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        int actualResult = mainClass.getLocalNumber();
        int expectedResult = 14;
        String errorMessage = "Variable have to be: " + expectedResult + " but actual variable is: " + actualResult;
        Assert.assertEquals(errorMessage, expectedResult, actualResult);
    }

    @Test
    public void testGetClassNumber() {
        String errorMessage = "Variable have to be more than 45.";
        Assert.assertTrue(errorMessage, mainClass.getClass_number() > 45);
    }

}
