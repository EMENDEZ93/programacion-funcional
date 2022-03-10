package functional.to.doubles;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        DoubleToIntFunction function = x -> (new Double(x)).intValue();

        // Act
        int resultado = function.applyAsInt(1.1);

        // Assert
        Assert.assertEquals(1, resultado);

    }

}
