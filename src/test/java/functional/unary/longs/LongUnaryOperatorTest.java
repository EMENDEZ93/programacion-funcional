package functional.unary.longs;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorTest {

    @Test
    public void methodTest(){

        // Arrange
        LongUnaryOperator operator = x -> x / 3L;

        // Act
        long resultado = operator.applyAsLong(9L);

        // Assert
        Assert.assertEquals(3, resultado);

    }

}
