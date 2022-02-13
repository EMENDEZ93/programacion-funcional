import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest {

    @Test
    public void methodTest(){

        // Arrange
        List<String> lista = Arrays.asList("A", "B", "C");

        Stream<String> stringStream = Stream.of("A", "B", "C");

        Stream<Integer> letrasUp = stringStream.map(String::length);

        Optional<Integer> optionalInteger = letrasUp.max((x, y) -> y - x);

        // Act

        // Assert

    }


    @Test
    public void streamOfList(){

        // Arrange
        List<String> lista = Arrays.asList("A", "B", "C");

        Stream<String> stringStream = lista.stream();
        // Act

        // Assert

    }


    @Test
    public void methodTestDos(){

        Stream<String> coursesStream = Arrays.asList("Java", "Node.js", "Kotlin").stream();

        Stream<String> javaCoursesStream = coursesStream.filter(course -> course.contains("Java"));


        Stream<String> explicitOperationStream = coursesStream.filter(new Predicate<String>() {
            public boolean test(String st) {
                return st.contains("Java");
            }
        });

    }
}
