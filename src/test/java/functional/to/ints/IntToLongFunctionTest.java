package functional.to.ints;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        IntToLongFunction function = x -> (new Integer(x)).longValue();

        // Act
        long resultado = function.applyAsLong(5);

        // Assert
        Assert.assertEquals(5l, resultado);

    }

}
