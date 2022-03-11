package functional.suppliers.longs;

import org.junit.Test;

import java.util.Random;
import java.util.function.LongSupplier;

public class LongSupplierTest {

    @Test
    public void methodTest(){

        // Arrange
        LongSupplier supplier = () -> new Random().nextLong();

        // Act
        long resultado = supplier.getAsLong();

        // Assert
        System.out.println(resultado);

    }

}
