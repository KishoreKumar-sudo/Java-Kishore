import java.util.*;

class SortingExample2 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Jhonny", "Kishore", "Shobi", "Robert", "Shekhar", "Jaani");
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
