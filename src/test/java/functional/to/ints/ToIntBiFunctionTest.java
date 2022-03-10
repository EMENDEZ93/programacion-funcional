package functional.to.ints;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        ToIntBiFunction<String, Double> function = (x, z) -> Integer.parseInt(x) + (new Double(z)).intValue();

        // Act
        int resultado = function.applyAsInt("5", 4.2);

        // Assert
        Assert.assertEquals(9, resultado);

    }

}
