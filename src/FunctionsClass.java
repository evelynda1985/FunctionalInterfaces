import java.util.function.Function;

//Takes an object an returns another object
public class FunctionsClass {

    Function<Person, Integer> ageMapper1 = person -> person.getAge();
    Function<Person, Integer> ageMapper2 = Person::getAge;

}
