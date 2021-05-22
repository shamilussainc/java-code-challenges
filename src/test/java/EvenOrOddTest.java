import org.junit.Assert;
import org.junit.Test;

public class EvenOrOddTest {
    @Test
    public void isEven_true(){
        Assert.assertTrue(EvenOrOdd.isEven(0));
        Assert.assertTrue(EvenOrOdd.isEven(2));
        Assert.assertTrue(EvenOrOdd.isEven(4));
        Assert.assertTrue(EvenOrOdd.isEven(-20));
        Assert.assertTrue(EvenOrOdd.isEven(-30));
        Assert.assertTrue(EvenOrOdd.isEven(100));
    }

    @Test
    public void isEven_false(){
        Assert.assertFalse(EvenOrOdd.isEven(1));
        Assert.assertFalse(EvenOrOdd.isEven(3));
        Assert.assertFalse(EvenOrOdd.isEven(5));
        Assert.assertFalse(EvenOrOdd.isEven(-15));
        Assert.assertFalse(EvenOrOdd.isEven(99));
        Assert.assertFalse(EvenOrOdd.isEven(-101));

    }

}
