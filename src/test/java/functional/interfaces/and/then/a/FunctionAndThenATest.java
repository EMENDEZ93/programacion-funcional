package functional.interfaces.and.then.a;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

public class FunctionAndThenATest {

    @Test
    public void methodTest(){

        // Arrange
        Function<String, Boolean> function= Boolean::parseBoolean;

        // Act
        int resultado = function.andThen(x -> x == true ? 1 : 0).apply("true");

        // Assert
        Assert.assertEquals(1, resultado);

    }

}
