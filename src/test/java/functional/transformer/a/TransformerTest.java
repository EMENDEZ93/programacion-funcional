package functional.transformer.a;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

public class TransformerTest {

    @Test
    public void methodTest(){

        // Arrange
        Function<String, Integer> function = x -> Integer.parseInt(x);

        // Act
        int resultado = transform("100", function);

        // Assert
        Assert.assertEquals(100, resultado);


    }

    @Test
    public void methodTestDos(){

        // Arrange
        Function<Integer, String> function = x -> Integer.toString(x);

        // Act
        String resultado = transform(200, function);

        // Assert
        Assert.assertEquals("200", resultado);

    }

    private static <X, Y> Y transform(X x, Function<X, Y> f) {
        return f.apply(x);
    }

}
