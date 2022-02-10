import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {

    @Test
    public void methodTest(){

        // Arrange
        List<String> personas = getList("A", "B", "C");

        // Act
        personas.forEach(person -> System.out.println(person));
        personas.forEach(System.out::println);

        // Assert
        usarZero(() -> 2);

        usarNada(() -> {
            System.out.println();
        });

    }

    static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }

    static Consumer<String> printer() {
        return s -> {
            System.out.println(s);
        };
    }

    static void usarZero(ZeroArgumentos zeroArgumentos) {
        System.out.println("Dentro del metodo -> " + zeroArgumentos.get());
    }

    static void usarNada(OperarNada operarNada) {

    }


    @FunctionalInterface
    interface ZeroArgumentos {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }

}
