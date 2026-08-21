import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Nagaraj");
        names.add("Kumar");
        names.add("Nagaraj"); // duplicates allowed

        System.out.println("ArrayList: " + names);
        System.out.println("First element: " + names.get(0));
        System.out.println("Contains Kumar: " + names.contains("Kumar"));
    }
}
