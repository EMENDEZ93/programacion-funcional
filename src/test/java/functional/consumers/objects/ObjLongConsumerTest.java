package functional.consumers.objects;

import org.junit.Test;

import java.util.function.ObjLongConsumer;

public class ObjLongConsumerTest {

    @Test
    public void methodTest(){

        // Arrange
        ObjLongConsumer<String> consumer = (x, y) -> System.out.println(Long.parseLong(x) + y);

        // Act
        consumer.accept("7", 2L);

        // Assert

    }

}
