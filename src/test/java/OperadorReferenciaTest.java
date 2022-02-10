import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class OperadorReferenciaTest {

    @Test
    public void methodTest(){

        // Arrange
        List<String> personas = getList("A", "B", "C");

        // Act
        personas.forEach(printer());
        personas.forEach(System.out::println);

        // Assert



    }

    static <T> List <T> getList(T... elements) {
        return Arrays.asList(elements);
    }

    static Consumer<String> printer() {
        return s -> {
            System.out.println(s);
        };
    }

}
