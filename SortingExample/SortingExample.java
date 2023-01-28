import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Jhonny", "Jhenny", "Joseph", "Jackie", "", "Jeffrey");
        List<String> name1 = Arrays.asList("Jhonny", "Jhenny", "Joseph", "Jackie", "", "Jeffrey");
        System.out.println(name);
        name.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(name);
        name.sort(Comparator.naturalOrder());
        System.out.println(name);
        name1.sort(Comparator.naturalOrder());
        System.out.println(name1);
    }
}
