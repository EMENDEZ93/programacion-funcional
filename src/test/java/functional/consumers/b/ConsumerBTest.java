package functional.consumers.b;

import org.junit.Test;

import java.util.function.Consumer;

public class ConsumerBTest {

    private static int sum  = 0;
    private static int prod = 1;

    @Test
    public void methodTest(){

        // Arrange
        Consumer<Integer> consum  = x -> sum  += x;
        Consumer<Integer> conprod = x -> prod *= x;

        // Act
        consum.andThen(conprod)
                .accept(4);
        consum.andThen(conprod)
                .accept(5);

        // Assert
        System.out.println("sum = " + sum + " prod =" + prod);

    }

}
