import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSortDemo {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Python");
        languages.add("SQL");
        languages.add("java");
        languages.add("PHP");
        System.out.println(languages);
        languages.sort(Comparator.naturalOrder());
        System.out.println(languages);
    }
}
