package functional.longs.a;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.LongFunction;

public class LongFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        LongFunction<Integer> function = x -> (int) x;

        // Act
        int resultado = function.apply(12L);

        // Assert
        Assert.assertEquals(12, resultado);

    }

}
