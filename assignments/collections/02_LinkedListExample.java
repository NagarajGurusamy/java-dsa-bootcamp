import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // duplicates allowed

        numbers.addFirst(5);
        numbers.addLast(30);

        System.out.println("LinkedList: " + numbers);
        System.out.println("First: " + numbers.getFirst());
        System.out.println("Last: " + numbers.getLast());
    }
}
