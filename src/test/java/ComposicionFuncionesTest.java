import org.junit.Test;

import java.util.function.Function;

public class ComposicionFuncionesTest {

    @Test
    public void methodTest(){

        // Arrange
        Function<Integer, Integer> operaconUno = x -> {
            System.out.printf("Operacion Uno -> " + x);
            return x * 3;
        };

        Function<Integer, Integer> operaconDos = operaconUno.compose(
                integer -> {
                    System.out.println("Operacion Dos -> " + integer);
                    return integer + 1;
                }
        );

        // Act
        System.out.println( "\n " + operaconDos.apply(5));

        // Assert

    }

    @Test
    public void methodTestd(){

        // Arrange
        Function<Integer, Integer> operaconUno = x -> {
            System.out.printf("Operacion Uno -> " + x);
            return x * 3;
        };

        Function<Integer, Integer> operaconDos = operaconUno.compose(
                integer -> {
                    System.out.println("Operacion Dos -> " + integer);
                    return integer + 1;
                }
        );

        Function<Integer, Integer> operacionTres = operaconDos.andThen(
                integer -> {
                    System.out.println("Operacoin Tres -> " + integer);
                    return integer * integer;
                }
        );

        // Act
        System.out.println( "\n " + operacionTres.apply(5));

        // Assert

    }


    @Test
    public void methodTestDos(){

        // Arrange


        // Act
        System.out.println( "\n " + operacionDos().apply(5));


        // Assert

    }

    static Function<Integer, Integer> operacionUno() {
        return integer -> {
            System.out.println("Operacion Uno metodo -> " + integer);
            return integer * 3;
        };
    }

    static Function<Integer, Integer> operacionDos() {
        return operacionUno().compose(integer -> {
            System.out.println("Operacion Dos metodo -> " + integer);
             return integer + 1;
        });
    }





    @Test
    public void methodTestTres(){

        // Arrange


        // Act
        System.out.println( "\n " + operacionThreeDos().apply(5));


        // Assert

    }

    static Function<String, String> operacionThreeUno() {
        return integer -> {
            System.out.println("Operacion Uno metodo -> " + integer);
            return integer + " EM";
        };
    }

    static Function<Integer, String> operacionThreeDos() {
        return operacionThreeUno().compose(integer -> {
            System.out.println("Operacion Dos metodo -> " + integer);
            return "EV!L";
        });
    }

}
