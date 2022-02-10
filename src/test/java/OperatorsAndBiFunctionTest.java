import org.junit.Assert;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorsAndBiFunctionTest {

    @Test
    public void unaryOperatorTest(){

        // Arrange
        UnaryOperator<String> quote = text -> text + " -> modificado";

        // Act
        String resultado = quote.apply("texto");

        // Assert
        Assert.assertEquals("texto -> modificado", resultado);

    }

    @Test
    public void isNull(){

        // Arrange
        UnaryOperator<String> quote = text -> text + " -> modificado";

        // Act
        String resultado = quote.apply(null);

        // Assert
        Assert.assertEquals("null -> modificado", resultado);

    }

    @Test
    public void binFunctionTest(){

        // Arrange
        BiFunction<Integer, Integer, Integer> multiplicacion = (x, y) -> x * y;

        // Act
        Integer resultado = multiplicacion.apply(2, 10);

        // Assert
        Assert.assertEquals(20, resultado.intValue());

    }

    @Test
    public void binaryFunctionTest(){

        // Arrange
        BinaryOperator<Integer> multiplicacion = (x, y) -> x * y;

        // Act
        Integer resultado = multiplicacion.apply(2, 10);

        // Assert
        Assert.assertEquals(20, resultado.intValue());

    }

    @Test
    public void leftPad(){

        // Arrange
        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);

        // Act
        String resultado = leftPad.apply("java", 5);

        // Assert
        Assert.assertEquals(" java", resultado);

    }


}
