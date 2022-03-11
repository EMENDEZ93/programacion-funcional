package functional.unary.ints.binary;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorTest {

    @Test
    public void methodTest(){

        // Arrange
        IntBinaryOperator operator = (x, y) -> x + y + 5;

        // Act
        int resultado = operator.applyAsInt(4, 2);

        // Assert
        Assert.assertEquals(11, resultado);

    }

}
