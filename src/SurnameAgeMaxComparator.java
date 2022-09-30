import java.util.Comparator;

public class SurnameAgeMaxComparator implements Comparator<Person> {
    private int maxWords;

    public SurnameAgeMaxComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
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
    }
}
