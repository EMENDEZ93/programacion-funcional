package functional.interfaces.identity.a;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

public class IdentityATest {

    @Test
    public void methodTest(){

        // Arrange
        Function<String, String> function = Function.identity();

        // Act
        String resultado = function.apply("String");

        // Assert
        Assert.assertEquals("String", resultado);

    }


    @Test
    public void methodDosTest(){

        // Arrange

        // Act
        String resultado = getIdentity().apply("String");

        // Assert
        Assert.assertEquals("String -> Modify", resultado);

    }

    private Function<String, String> getIdentity() {
        return s -> {
            s += " -> Modify";
            return (String) Function.identity().apply(s);
        };
    }


}
