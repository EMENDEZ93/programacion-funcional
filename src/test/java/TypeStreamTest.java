import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TypeStreamTest {

    @Test
    public void crearDatosInfinitos(){

        // Arrange
        IntStream intStream = IntStream.iterate(0, x -> x + 1);

        // Act
        // limitar el generados de numeros
        intStream.limit(1000)
                .parallel()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        // Assert

    }

    @Test
    public void methodTest(){

//Nos indica si un stream contiene un elemento según el Predicate que le pasemos:
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 11);
        boolean biggerThanTen = numbersStream.anyMatch(i -> i > 10); //true porque tenemos el 11

//allMatch
//Nos indica si todos los elementos de un Stream cumplen con un cierto Predicate:
        Stream<Integer> agesStream = Stream.of(19, 21, 35, 45, 12);
        boolean allLegalDrinkingAge = agesStream.allMatch(age -> age > 18); //false, tenemos un menor

//noneMatch
//Nos indica si todos los elementos de un Stream NO CUMPLEN un cierto Predicate:
        Stream<Integer> oddNumbers = Stream.of(1, 3, 5, 7, 9, 11);
        boolean allAreOdd = oddNumbers.noneMatch(i -> i % 2 == 0);

    }

    @Test
    public void minAndMax(){

        Stream<Long> bigNumbers = Stream.of(100L, 200L, 1000L, 5L);
        Optional minimumOptional = bigNumbers.min((numberX, numberY) -> (int) Math.min(numberX, numberY));

    }


    @Test
    public void reduceBinaryAccumulator(){

        Stream aLongStoryStream = Stream.of("Cuando", "despertó,", "el", "dinosaurio", "todavía", "estaba", "allí.");
        Optional longStoryOptional = aLongStoryStream.reduce((previousStory, nextPart) -> previousStory + " " + nextPart);
        longStoryOptional.ifPresent(System.out::println); //"Cuando despertó, el dinosaurio todavía estaba allí."
    }

    @Test
    public void reduceValorInicialBinaryOperator(){

        Stream<Integer> firstTenNumbersStream = Stream.iterate(0, i -> i + 1).limit(10);
        int sumOfFirstTen = firstTenNumbersStream.reduce(0, Integer::sum); //45 -> 0 + 1 + … + 9

    }

    @Test
    public void reducevalorInicialBinaryFunctionBinaryOperator(){
        Stream<String> aLongStoryStreamAgain = Stream.of("Cuando", "despertó,", "el", "dinosaurio", "todavía", "estaba", "allí.");
        int charCount = aLongStoryStreamAgain.reduce(0, (count, word) -> count + word.length(), Integer::sum);
    }


    @Test
    public void counts(){
        Stream yearsStream = Stream.of(1990, 1991, 1994, 2000, 2010, 2019, 2020);
        long yearsCount = yearsStream.count(); //7, solo nos dice cuantos datos tuvo el stream.
    }


    @Test
    public void operacionesIntermedias(){

        Stream<String> initialCourses = Stream.of("Java", "Spring", "Node.js");

        Stream<Integer> lettersOnCourses = initialCourses.map(course -> course.length());
//De este punto en adelante, initialCourses ya no puede agregar mas operaciones.

        Stream evenLengthCourses = lettersOnCourses.filter(courseLength -> courseLength % 2 == 0);
//lettersOnCourses se consume en este punto y ya no puede agregar mas operaciones. No es posible usar el Stream mas que como referencia.
    }

    @Test
    public void methodTestDos(){

        // Arrange
        IntStream intStream = IntStream.iterate(0, x -> x + 1);
        List<Integer> integers = intStream.limit(1000)
                .filter(x -> x % 2 == 0)
                .boxed() // Convierte instream -> Stream
                .collect(Collectors.toList());

        // Act

        // Assert

    }


}
