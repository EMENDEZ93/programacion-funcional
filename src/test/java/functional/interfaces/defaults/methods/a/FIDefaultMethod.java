package functional.interfaces.defaults.methods.a;

@FunctionalInterface
public interface FIDefaultMethod<X extends ObjectA> {

    void executer(X objectoA);

    default String firstMethod(X objectoA) {
        return objectoA.value + "- Modify";
    }

}
