package functional.to.ints;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntFunction;

public class ToIntFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        ToIntFunction<String> function = x -> Integer.parseInt(x);

        // Act
        int resultado = function.applyAsInt("10");

        // Assert
        Assert.assertEquals(10, resultado);

    }

}
