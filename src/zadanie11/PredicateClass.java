package zadanie11;

import java.util.function.Predicate;

public class PredicateClass implements Predicate<Boolean> {
    @Override
    public boolean test(Boolean aBoolean) {
        System.out.println(aBoolean);
        return !aBoolean;
    }
}
