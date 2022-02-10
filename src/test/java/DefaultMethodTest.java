import org.junit.Test;

public class DefaultMethodTest {

    @Test
    public void methodTest(){

        // Arrange
        Operacion operacion = () -> 6;

        // Act
        operacion.operate("Edwin");

        // Assert

    }


    @FunctionalInterface
    interface Operacion {
        int action();

        default void operate(String s) {
            int x = action();
            while (x-- > 0) {
                System.out.println(s);
            }

        }

    }


    @Test
    public void dos(){

        // Arrange
        OperacionDos operacionDos = text -> System.out.println(text);

        // Act
        operacionDos.operate(5, "Mendez");

        // Assert

    }

    @FunctionalInterface
    interface OperacionDos {
        void take(String x);

        default void operate(int x, String s) {
            while (x-- > 0) {
                take(s);
            }
        }

    }

}
