package functional.consumers.a;

import org.junit.Test;

import java.util.function.Consumer;

public class ConsumerATest {

    private static int fx = 0;

    @Test
    public void methodTest(){

        // Arrange
        Consumer<Integer> consumer = x -> fx += 5 * (int) Math.pow(x, 4);

        // Act
        consumer.andThen(x -> fx += 7 * (int)Math.pow(x, 3))
                .andThen(x -> fx += 4 * (int)Math.pow(x, 2))
                .andThen(x -> fx += 3 * x)
                .andThen(x -> fx += 8)
                .andThen(x -> System.out.println(fx))
                .accept(2);

        // Assert

    }

}
