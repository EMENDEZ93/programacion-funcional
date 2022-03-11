package functional.suppliers.booleans;

import org.junit.Test;

import java.util.Random;
import java.util.function.BooleanSupplier;

public class BooleanSupplierTest {

    @Test
    public void methodTest(){

        // Arrange
        BooleanSupplier supplier = () -> new Random().nextInt(2) == 1;

        // Act
        boolean resultado = supplier.getAsBoolean();

        // Assert
        System.out.println("resultado -> " + resultado);

    }

}
