package functional.then;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.UnaryOperator;

public class ThenTest {

    @Test
    public void methodTest() {
        String resultado = getModifiedA().andThen(getModifiedB()).apply("Original");
        Assert.assertEquals("Original::ModifiedA::ModifiedB", resultado);
    }

    public UnaryOperator<String> getModifiedA() {
        return s -> s + "::ModifiedA";
    }

    public UnaryOperator<String> getModifiedB() {
        return s -> s + "::ModifiedB";
    }

}
