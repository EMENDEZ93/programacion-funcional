package functional.to.doubles;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        DoubleToLongFunction function = x -> (new Double(x)).longValue();

        // Act
        long resultado = function.applyAsLong(4.1);

        // Assert
        Assert.assertEquals(4L, resultado);

    }
}
