import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        Comparator<Person> SurnameAgeMaxComparator = (o1, o2) -> {
            int maxWords = 3;
            int wordsSurname1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int wordsSurname2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
            if (wordsSurname1 >= maxWords && wordsSurname2 >= maxWords) {
                if (wordsSurname1 > wordsSurname2) {
                    return 1;
                } else if (wordsSurname1 < wordsSurname2) {
                    return -1;
                } else {
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Collections.sort(people, SurnameAgeMaxComparator);
        System.out.println(people);
    }
}