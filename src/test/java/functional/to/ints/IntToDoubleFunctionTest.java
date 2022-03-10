package functional.to.ints;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        IntToDoubleFunction function = x -> (new Integer(x)).doubleValue();

        // Act
        double resultado = function.applyAsDouble(100);

        // Assert
        Assert.assertEquals(100f, resultado, 5);

    }

}
