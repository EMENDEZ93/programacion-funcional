package functional.to.longs;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToLongFunction;

public class ToLongFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        ToLongFunction<Double> function = Double::longValue;

        // Act
        Long resultado = function.applyAsLong(5.1);

        // Assert
        Assert.assertEquals(java.util.Optional.of(5L).get(), resultado);

    }

}
