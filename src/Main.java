import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        //Predicate

        Predicate<String> predicate1 = s -> s.length() < 20;
        Predicate<String> predicate2 = s -> s.length() > 5;
        Predicate<String> predicate3 = predicate1.and(predicate2);
        Predicate<String> predicate4 = predicate1.or(predicate2);
        Predicate<String> predicate5 = Predicate.isEqual(predicate2);

        boolean b1 = predicate1.test("Hello");
        boolean b2 = predicate2.test("Hello World");
        boolean b3 = predicate3.test("Predicate 1 AND predicate2");
        boolean b4 = predicate4.test("Predicate 1 OR predicate2");
        boolean b5 = predicate5.test("Predicate 1 Equal predicate2");

        System.out.println("Hello is shorter than 20 chars: " + b1 );
        System.out.println("Hello is longer that than 5 chars: " + b2 );
        System.out.println("Predicate 1 AND predicate2: " + b3);
        System.out.println("Predicate 1 OR predicate2: " + b4);
        System.out.println("Predicate 1 Equals predicate2: " + b5);

    }
}
