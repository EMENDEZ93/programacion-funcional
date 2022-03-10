package functional.doubles.a;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.DoubleFunction;

public class DoubleFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        DoubleFunction<Boolean> function = x -> x > 5.0;

        // Act
        Boolean resultado = function.apply(4.5);

        // Assert
        Assert.assertFalse(resultado);

    }

}
