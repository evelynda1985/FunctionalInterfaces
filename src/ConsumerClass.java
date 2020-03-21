import java.util.function.Consumer;

// A consumer consumes an object, and does not return anything
public class ConsumerClass {

    Consumer<String> printer1 = s -> System.out.println(s);
    Consumer<String> printer2 = System.out::println;
}
