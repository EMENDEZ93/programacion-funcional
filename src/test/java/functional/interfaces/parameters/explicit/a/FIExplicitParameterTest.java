package functional.interfaces.parameters.explicit.a;

import org.junit.Assert;
import org.junit.Test;

public class FIExplicitParameterTest {

    @Test
    public void methodTest(){

        // Arrange
        FIExplicitParameter parameter = (String string, int integer) -> string + Integer.toString(integer + 1 );

        // Act
        String result = parameter.method("Value ", 2022);

        // Assert
        Assert.assertEquals("Value 2023", result);

    }

}
