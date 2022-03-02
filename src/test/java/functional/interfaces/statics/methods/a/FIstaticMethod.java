package functional.interfaces.statics.methods.a;

@FunctionalInterface
public interface FIstaticMethod {

    int executer(Integer value);

    static int firstMethod(Integer value) {
        System.out.println("firstMethod");
        return value * 10;
    }

    static int secondMethod(Integer value) {
        System.out.println("secondMethod");
        return value * 100;
    }

}
