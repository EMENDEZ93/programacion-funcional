package functional.to.doubles;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        ToDoubleBiFunction<Integer, Long> function = (x, z) -> (new Integer(x)).doubleValue() + (new Long(z)).doubleValue();

        // Act
        double resultado = function.applyAsDouble(7, 8L);

        // Assert
        Assert.assertEquals(15, resultado, 1);

    }

}
