import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTest {

    @Test
    public void isOdd(){

        // Arrange
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        // Act
        Boolean resultado = isOdd.apply(3);

        // Assert
        Assert.assertTrue(resultado);

    }

    @Test
    public void isEven(){

        // Arrange
        Function<Integer, Boolean> isEven = x -> x % 2 == 0;

        // Act
        Boolean resultado = isEven.apply(2);

        // Assert
        Assert.assertTrue(resultado);

    }


    @Test
    public void isEvenPredicate(){

        // Arrange
        Predicate<Integer> isEven = x -> x % 2 == 0;

        // Act
        Boolean resultado = isEven.test(4);

        // Assert
        Assert.assertTrue(resultado);

    }

    @Test
    public void methodTest(){

        // Arrange
        Persona persona = new Persona(20);
        Predicate<Persona> isMayorEdad = person -> person.getEdad() > 18;

        // Act
        Boolean resultado = isMayorEdad.test(persona);
        Boolean resultado2 = isMayorEdad.negate().test(persona);
        // Assert
        Assert.assertTrue(resultado);

    }

    static class Persona {
        private int edad;

        public Persona(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }
    }

}
