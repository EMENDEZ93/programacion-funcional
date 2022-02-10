import org.junit.Test;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplierTest {

    @Test
    public void methodTest(){

        // Arrange


        // Act

        // Assert

    }

    static class Paquete {
        private boolean isInternacional;

        public boolean isInternacional() {
            return isInternacional;
        }
    }

    static class PaquetesUtils {

        static void mostrarEsInternacional(Paquete paquete) {
            Consumer<Paquete> paqueteConsumer = paquete1 -> {
                if(paquete1.isInternacional()) {
                    System.out.println("Es internacional");
                }
            };
            paqueteConsumer.accept(paquete);
        }

        static Paquete generatePaquete() {
            Supplier<Paquete> paqueteSupplier = Paquete::new;
            return paqueteSupplier.get();
        }

    }

}
