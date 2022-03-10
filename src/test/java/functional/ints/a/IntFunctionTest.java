package functional.ints.a;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.IntFunction;

public class IntFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        IntFunction<String> function = x -> (new Integer(x)).toString();

        // Act
        String a = function.apply(100);

        // Assert
        Assert.assertEquals("100", a);

    }


}
