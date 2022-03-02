package functional.interfaces.statics.methods.a;

import org.junit.Assert;
import org.junit.Test;

public class FIstaticMethodTest {

    @Test
    public void methodTest(){

        // Arrange
        Integer arrange = 2;
        FIstaticMethod method = value -> {
            return value * 2;
        };

        // Act
        int resultado = method.executer(arrange);

        // Assert
        Assert.assertEquals(4, resultado);
        Assert.assertEquals(40, FIstaticMethod.firstMethod(resultado));
        Assert.assertEquals(400, FIstaticMethod.secondMethod(resultado));

    }

    @Test
    public void methodTestUno(){


        // Arrange
        Integer arrange = 2;


        // Act
        int resultado = method().executer(arrange);

        // Assert
        Assert.assertEquals(4, resultado);
        Assert.assertEquals(40, FIstaticMethod.firstMethod(resultado));
        Assert.assertEquals(400, FIstaticMethod.secondMethod(resultado));

    }

    private FIstaticMethod method() {
        return value -> value * 2;
    }

}
