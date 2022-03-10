package functional.interfaces.compose.a;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

public class ComposeATest {

    @Test
    public void methodTest(){

        // Arrange
        Function<Boolean, Integer> functiona = x -> {
            System.out.println("functiona -> " + x);
            return x == true ? 1 : 0;
        };

        Function<String, Boolean> functionb = x -> {
            System.out.println("functionb -> " + x);
            return Boolean.parseBoolean(x);
        };

        // Act
        int resultado = functiona.compose(functionb).apply("true");

        // Assert
        Assert.assertEquals(1, resultado);

    }


}
