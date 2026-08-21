import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Nagaraj");
        students.put(102, "Arun");
        students.put(103, "Kumar");
        students.put(101, "Gurusamy"); // same key: old value is replaced

        System.out.println("HashMap: " + students);
        System.out.println("Student 102: " + students.get(102));
        System.out.println("Contains key 103: " + students.containsKey(103));
    }
}
