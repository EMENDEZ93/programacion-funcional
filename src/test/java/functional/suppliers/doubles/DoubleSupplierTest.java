package functional.suppliers.doubles;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.function.DoubleSupplier;

public class DoubleSupplierTest {

    @Test
    public void methodTest(){

        // Arrange
        DoubleSupplier supplier = () -> new Random().nextDouble();

        // Act
        double resultado = supplier.getAsDouble();

        // Assert
        System.out.println(resultado);

    }

}
