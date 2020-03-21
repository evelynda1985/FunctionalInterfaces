import java.util.function.Predicate;

public class PredicateClass {

    Predicate<String> p1 = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() < 20;
        }
    };

    Predicate<String> p2 = (s) -> s.length() < 20;



}
