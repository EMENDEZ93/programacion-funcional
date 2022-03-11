package functional.biconsumer;

import org.junit.Test;

import java.util.function.BiConsumer;

public class BiConsumerTest {

    private static int sum = 0;
    private static String components = "";

    @Test
    public void methodTest(){

        // Arrange
        BiConsumer<Integer, String> consumer = (x, y) -> {
            sum += x;
            components += y;
        };

        // Act
        consumer.andThen((x, y) -> System.out.println(x + " " + y))
                .accept(6, "Term 1");


        // Assert
        consumer.andThen((x, y) -> System.out.println("add " + x + " " + y
                + " result = " + sum + " " + components))
                .accept(7, ",Term 2");


    }

}
