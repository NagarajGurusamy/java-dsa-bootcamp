import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Java");
        names.add("Python");
        names.add("C");
        names.add("Java"); // duplicate is ignored

        System.out.println("LinkedHashSet: " + names);
        // Insertion order is maintained.
    }
}
