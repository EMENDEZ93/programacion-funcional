package functional.interfaces.voids.a;

import org.junit.Test;

public class FIVoidTest {

    @Test
    public void methodTest(){

        // Arrange
        FIVoid aVoid = x -> System.out.println("Number's value is " + x);

        // Act
        aVoid.voidMethod(2022);

        // Assert

    }

}
