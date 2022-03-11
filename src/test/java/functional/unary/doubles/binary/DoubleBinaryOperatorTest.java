package functional.unary.doubles.binary;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorTest {

    @Test
    public void methodTest(){

        // Arrange
        DoubleBinaryOperator operator = (x, y) -> x * y * 0.5;

        // Act
        double resultado = operator.applyAsDouble(4.0, 6.0);

        // Assert
        Assert.assertEquals(12, resultado, 1);

    }

}
