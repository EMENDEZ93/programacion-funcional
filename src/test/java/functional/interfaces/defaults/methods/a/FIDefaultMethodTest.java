package functional.interfaces.defaults.methods.a;

import org.junit.Assert;
import org.junit.Test;

public class FIDefaultMethodTest {

    @Test
    public void methodTest(){

        // Arrange
        ObjectA objectA = new ObjectA("");
        FIDefaultMethod<ObjectA> method = new FIDefaultMethod<ObjectA>() {
            @Override
            public void executer(ObjectA objectoA) {
                objectoA.value = "Executer";
            }
        };

        // Act
        method.executer(objectA);

        // Assert
        Assert.assertEquals("Executer", objectA.value);
        Assert.assertEquals("Executer", method.firstMethod(objectA));

    }


    @Test
    public void fIDefaultMethodUnoTest(){

        // Arrange
        ObjectA objectA = new ObjectA("");

        // Act
        fIDefaultMethodUno().executer(objectA);

        // Assert
        Assert.assertEquals("Executer", objectA.value);
        Assert.assertEquals("Executer", fIDefaultMethodUno().firstMethod(objectA));

    }


    @Test
    public FIDefaultMethod<ObjectA> fIDefaultMethodUno(){
        return objectoA -> objectoA.value = "Executer";
    }

}
