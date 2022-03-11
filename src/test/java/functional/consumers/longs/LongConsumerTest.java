package functional.consumers.longs;

import org.junit.Test;

import java.util.function.LongConsumer;

public class LongConsumerTest {

    private static long b = 0;

    @Test
    public void methodTest(){

        // Arrange
        LongConsumer consumer = x -> b = x / 2L;

        // Act
        consumer.andThen(x -> System.out.println(b))
                .accept(6L);

        // Assert

    }

}
