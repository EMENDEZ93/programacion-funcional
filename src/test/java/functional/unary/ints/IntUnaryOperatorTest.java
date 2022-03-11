package functional.unary.ints;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorTest {

    @Test
    public void methodTest(){

        // Arrange
        IntUnaryOperator operator = x -> x + 5;

        // Act
        int resultado = operator.applyAsInt(4);

        // Assert
        Assert.assertEquals(9, resultado);

    }

}
