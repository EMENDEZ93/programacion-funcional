package functional.unary.doubles;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorTest {

    @Test
    public void methodTest(){

        // Arrange
        DoubleUnaryOperator operator = x -> x * 2.1;

        // Act
        double resultado = operator.applyAsDouble(4.1);

        // Assert
        Assert.assertEquals(8.61, resultado, 5);

    }

}
