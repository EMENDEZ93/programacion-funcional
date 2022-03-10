package functional.to.longs;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        LongToIntFunction function = x -> (new Long(x)).intValue();

        // Act
        int resultado = function.applyAsInt(100);

        // Assert
        Assert.assertEquals(100, resultado);

    }

}
