package functional.unary.longs.binary;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorTest {

    @Test
    public void methodTest(){

        // Arrange
        LongBinaryOperator operator = (x, y) -> (x + y)/ 3L;

        // Act
        long resultado = operator.applyAsLong(9L, 3L);

        // Assert
        Assert.assertEquals(4, resultado);

    }

}
