import java.util.function.Supplier;

//A supplier provides an object, takes no parameter
public class SupplierClass {

    Supplier<Person> personSupplier1 = () -> new Person();

}
