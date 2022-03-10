package functional.to.longs;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        LongToDoubleFunction function = x -> (new Long(x)).doubleValue();

        // Act
        double resultado = function.applyAsDouble(10);

        // Assert
        Assert.assertEquals(10, resultado, 1);

    }

}
