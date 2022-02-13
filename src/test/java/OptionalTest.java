import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

    @Test
    public void methodTest(){

        // Arrange
        Optional<List<String>> strings = getList();

        // Act
        if(strings.isPresent()) {

        }

        strings.ifPresent(values -> values.forEach(System.out::println));

        // Assert

    }

    static Optional<List<String>> getList() {
        List<String> strings = new LinkedList<>();
        return Optional.of(strings);
    }


    @Test
    public void methodTestDos(){

        // Arrange
        Optional<String> string = getString(null);

        // Act

        // Assert
        Assert.assertEquals("a", string.get());

    }

    static Optional<String> getString(String string) {
        return Optional.ofNullable(string);
    }



    @Test
    public void methodTestThrees(){

        // Arrange
        Optional<String> string = getStringThrees(null);

        // Act
        string.ifPresent(System.out::println);


        // Assert
        Assert.assertEquals("a", string.orElse("No Existe Este Dato"));

    }

    static Optional<String> getStringThrees(String string) {

        try {
            return Optional.of(string);
        } catch (Exception e) {
            System.out.println("Error....");
        }

        return Optional.empty();
    }


}
