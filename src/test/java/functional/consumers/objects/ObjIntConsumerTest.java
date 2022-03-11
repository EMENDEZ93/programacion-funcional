package functional.consumers.objects;

import org.junit.Test;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerTest {

    @Test
    public void methodTest(){

        // Arrange
        ObjIntConsumer<String> consumer = (x, y) -> System.out.println(x + " = " + y);

        // Act
        consumer.accept("Value", 4);

        // Assert

    }

}
