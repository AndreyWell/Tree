import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Petya", "Epetrov Lalexin P", 15));
        people.add(new Person("Alex", "Lalexin", 25));
        people.add(new Person("Olya", "Golgina-Atanina O", 12));
        people.add(new Person("Ivan", "Vivanov-Lalexin", 18));
        people.add(new Person("Tanya", "Atanina-Golgina T", 17));
        System.out.println(people);
        System.out.println();

        // Predicate<Person>
        people.removeIf(person -> person.getAge() < 18);

        Collections.sort(people, new SurnameAgeMaxComparator(3));
        System.out.println(people);
    }
}