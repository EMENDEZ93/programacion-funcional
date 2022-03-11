package functional.suppliers.ints;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.function.IntSupplier;

public class IntSupplierTest {

    @Test
    public void methodTest(){

        // Arrange
        IntSupplier supplier = () -> new Random().nextInt();

        // Act
        int resultado = supplier.getAsInt();

        // Assert
        System.out.println(resultado);

    }

}
