import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass mainClass = new MainClass();
    String errorMessage;

    @Test
    public void testGetLocalNumber() {
        int actualResult = mainClass.getLocalNumber();
        int expectedResult = 14;
        errorMessage = "Variable have to be: " + expectedResult + " but actual variable is: " + actualResult;
        Assert.assertEquals(errorMessage, expectedResult, actualResult);
    }

    @Test
    public void testGetClassNumber() {
        errorMessage = "Variable have to be more than 45.";
        Assert.assertTrue(errorMessage, mainClass.getClass_number() > 45);
    }

    @Test
    public void testGetClassString() {
        String hello = "hello";
        String hello_1 = "Hello";
        boolean expectedResult = mainClass.getClass_string().contains(hello) || mainClass.getClass_string().contains(hello_1);
        errorMessage = "Text have to be contains " + hello + " or " + hello_1;
        Assert.assertTrue(errorMessage, expectedResult);
    }

}
