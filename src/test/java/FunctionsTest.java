import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionsTest {

    @Test
    public void caso1(){

        // Arrange
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }

        };

        // Act
        Integer resultado = square.apply(10);

        // Assert
        Assert.assertEquals(100, resultado.intValue());

    }

    @Test
    public void caso2(){

        // Arrange

        // Act
        Integer resultado = squareMethod(10);

        // Assert
        Assert.assertEquals(100, resultado.intValue());

    }

    static int squareMethod(int x) {
        return x * x;
    }


    @Test
    public void caso3(){

        // Arrange
        Stream<Integer> x = Stream.of(2)
                .map(sumar());

        // Act
        Integer resultado = x.findFirst().get();

        // Assert
        Assert.assertEquals(4, resultado.intValue());

    }

    private Function<Integer, Integer> sumar () {
        return x -> x + 2;
    }



}
