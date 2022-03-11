package functional.consumers.ints;

import org.junit.Test;

import java.util.function.IntConsumer;

public class IntConsumerTest {

    private static int a = 0;

    @Test
    public void methodTest(){

        // Arrange
        IntConsumer consumer = x -> a = x + 3;

        // Act
        consumer.andThen(x -> System.out.println(a + " - " + x)).accept(2);

        // Assert

    }

}
