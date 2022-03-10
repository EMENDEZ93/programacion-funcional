package functional.predicate.a;

import org.junit.Test;

import java.util.function.Predicate;

public class PredicateAndTest {

    @Test
    public void methodTest(){

        // Arrange
        Predicate<Integer> predicate = x -> x > 10;

        // Act
        //System.out.println( predicate.and(Predicate.not(x -> x % 2 == 1)).test(9)  );

        // Assert

    }

}
