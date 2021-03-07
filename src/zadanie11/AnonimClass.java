package zadanie11;

import java.util.function.Predicate;

public class AnonimClass {
    public static void main(String[] args) {
        Predicate<Boolean> predicate = b -> !b;
        predicate.test(true);
        System.out.println(predicate.test(true));
        }

    }

