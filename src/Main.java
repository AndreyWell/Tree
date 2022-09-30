import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Petya", "Epetrov Lalexin P", 25));
        people.add(new Person("Alex", "Lalexin", 35));
        people.add(new Person("Olya", "Golgina-Atanina O", 20));
        people.add(new Person("Ivan", "Vivanov-Lalexin", 40));
        people.add(new Person("Tanya", "Atanina-Golgina", 30));
        System.out.println(people);
        System.out.println();
        Collections.sort(people, new SurnameAgeMaxComparator(3));
        System.out.println(people);
    }
}