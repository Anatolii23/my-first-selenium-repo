package zadanie11;

import java.util.function.Predicate;

public class AnonimClass {
    public static void main(String[] args) {
        Predicate<Boolean> predicate = new Predicate<Boolean>() {
            @Override
            public boolean test(Boolean b) {
                System.out.println(b);
                return !b;
            }
        };
        predicate.test(true);
    }
}
