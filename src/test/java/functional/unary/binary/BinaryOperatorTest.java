package functional.unary.binary;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    @Test
    public void methodTest(){

        // Arrange
        BinaryOperator<String> operator = (x, y) -> x + y;

        // Act
        String resultado = operator.apply("AB", "CD");

        // Assert
        Assert.assertEquals("ABCD", resultado);

    }

    @Test
    public void methodTestDos(){

        // Arrange
        BinaryOperator<Integer> operator = (x,y) -> x - y;

        // Act
        int resultado = operator.apply(4, 1);

        // Assert
        Assert.assertEquals(3, resultado);

    }


    @Test
    public void methodTestTres(){

        // Arrange
        BinaryOperator<Long> operator = (x,y) -> x * y;

        // Act
        long resultado = operator.apply(4L, 3L);

        // Assert
        Assert.assertEquals(12, resultado);

    }

}
