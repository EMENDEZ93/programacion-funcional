package functional.consumers.objects;

import org.junit.Test;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerTest {

    @Test
    public void methodTest(){

        // Arrange
        ObjDoubleConsumer<String> consumer = (x, y) -> System.out.println(x + (new Double(y)).toString());

        // Act
        consumer.accept("DBL", 4.1);

        // Assert

    }

}
