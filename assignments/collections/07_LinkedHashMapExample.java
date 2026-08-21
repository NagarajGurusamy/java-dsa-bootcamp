import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Nagaraj");
        students.put(102, "Arun");
        students.put(103, "Kumar");

        System.out.println("LinkedHashMap: " + students);
        // Entries are displayed in insertion order.
    }
}
