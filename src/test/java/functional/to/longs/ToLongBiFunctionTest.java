package functional.to.longs;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        ToLongBiFunction<Double, String> function = (x, z) -> x.longValue() + Long.parseLong(z);

        // Act
        long resultado = function.applyAsLong(5.1, "6");

        // Assert
        Assert.assertEquals(11, resultado);

    }

}
