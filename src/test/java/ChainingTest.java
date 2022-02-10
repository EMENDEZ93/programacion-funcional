import org.junit.Test;

public class ChainingTest {

    @Test
    public void methodTest(){

        // Arrange
        Chainer chainer = new Chainer();

        // Act
        chainer.operacionUno()
                .operacionDos()
                .operacionUno()
                .operacionDos();

        // Assert

    }

    static class Chainer {

        public Chainer operacionUno() {
            System.out.println("operacionUno");
            return this;
        }

        public Chainer operacionDos() {
            System.out.println("operacionDos");
            return this;
        }

    }

}
