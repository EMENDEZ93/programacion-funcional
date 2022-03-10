package functional.to.doubles;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionTest {

    @Test
    public void methodTest(){

        // Arrange
        ToDoubleFunction<Integer> function = Integer::doubleValue;

        // Act
        Double resultado = function.applyAsDouble(7);

        // Assert
        Assert.assertEquals(java.util.Optional.of(7.0).get(), resultado);

    }

}
