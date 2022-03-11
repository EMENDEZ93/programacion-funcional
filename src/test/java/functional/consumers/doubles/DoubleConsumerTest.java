package functional.consumers.doubles;

import org.junit.Test;

import java.util.function.DoubleConsumer;

public class DoubleConsumerTest {

    private static double c = 1.0;

    @Test
    public void methodTest(){

        // Arrange
        DoubleConsumer consumer = x -> c = x * c;

        // Act
        consumer.andThen(x -> System.out.println(c))
                .accept(4.0);

        // Assert

    }

}
