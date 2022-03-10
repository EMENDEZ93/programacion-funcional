package functional.bifunction;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.BiFunction;

public class BiFunctionTest {


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
    public void biFunctionUnoTest(){

        // Arrange

        // Act
        Integer resultado = biFunctionUno().apply(2, 10);

        // Assert
        Assert.assertEquals(20, resultado.intValue());

    }

    public BiFunction<Integer, Integer, Integer> biFunctionUno(){
        return (x, y) -> x * y;
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


    @Test
    public void biFunctionDosTest(){

        // Arrange

        // Act
        String resultado = biFunctionDos().apply("java", 5);

        // Assert
        Assert.assertEquals(" java", resultado);

    }

    public BiFunction<String, Integer, String> biFunctionDos(){
        return (text, number) -> String.format("%" + number + "s", text);
    }

    @Test
    public void biFunctionTresTest(){

        // Arrange

        // Act
        String resultado = biFunctionTres("2022").apply("java", 5);

        // Assert
        Assert.assertEquals(" java", resultado);

    }

    public BiFunction<String, Integer, String> biFunctionTres(String valores){
        System.out.println("Valor externo -> " + valores);
        return (text, number) -> String.format("%" + number + "s", text);
    }


}
