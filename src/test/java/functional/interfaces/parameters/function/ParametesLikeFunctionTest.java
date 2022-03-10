package functional.interfaces.parameters.function;

import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Function;

public class ParametesLikeFunctionTest {


    @Test
    public void methodTest(){

        // Arrange
        ArrayList<Function<String, ? extends Number>> list = new ArrayList<>();

        list.add(x -> {
            System.out.println("Byte.parseByte -> " + x);
            return Byte.parseByte(x);
        });

        list.add(x -> {
            System.out.println("Short.parseShort -> " + x);
            return Short.parseShort(x);
        });

        list.add(x -> {
            System.out.println("Integer.parseInt -> " + x);
            return Integer.parseInt(x);
        });

        list.add(x -> {
            System.out.println("Long.parseLong -> " + x);
            return Long.parseLong(x);
        });

        list.add(x -> {
            System.out.println("Float.parseFloat -> " + x);
            return Float.parseFloat(x);
        });

        list.add(x -> {
            System.out.println("Double.parseDouble -> " + x);
            return Double.parseDouble(x);
        });

        String[] numbers = {"11", "22", "33", "44", "55", "66"};
        Number[] results = new Number[numbers.length];

        // Act
        for (int i = 0; i < numbers.length; ++i) {
            results[i] = parse(numbers[i], list.get(i));
        }

        // Assert

    }

    private static <Y extends Number> Y parse(String x, Function<String, Y> f) {
        return f.apply(x);
    }

}
