package functional.suppliers;

import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

    @Test
    public void methodTest(){

        // Arrange
        Supplier<Integer> supplier = () -> {
            Random rand = new Random();
            return rand.nextInt(100);
        };

        // Act
        int resultado = supplier.get();

        // Assert
        System.out.println(resultado);

    }

}
