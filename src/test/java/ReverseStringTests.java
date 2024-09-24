import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTests {

    @Test
    public void reverseTestWithNull(){
        Assert.assertNull(ReverseString.reverseString(null));
        System.out.println("reverseTestWithNull passed");
    }

    @Test
    public void reverseTestWithDigits(){
        Assert.assertEquals("cbA321", ReverseString.reverseString("123Abc"));
        System.out.println("reverseTestWithDigits passed");
    }

    @Test
    public void reverseTestHappyPath(){
        Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
        System.out.println("reverseTestHappyPath test added!");
    }





}
