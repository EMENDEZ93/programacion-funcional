import org.junit.Test;


public class SamTest {

    // Singla Abstract Method
    @Test
    public void methodTest(){

        // Arrange
        TriFunction<Integer, Integer, Integer, String> function = (day, month, year)
                -> year + "-" + month + "-" + day;

        // Act
        System.out.println(function.apply(2,3,4));

        // Assert

    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R>  {
        R apply(T t, U u, V v);
    }

}
