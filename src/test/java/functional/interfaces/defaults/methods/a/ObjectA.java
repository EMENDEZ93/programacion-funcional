package functional.interfaces.defaults.methods.a;

public class ObjectA {

    String value;

    public ObjectA(String value) {
        this.value = value;
    }

    public ObjectA(ObjectA objectA) {
        this.value = objectA.value;
    }

}
