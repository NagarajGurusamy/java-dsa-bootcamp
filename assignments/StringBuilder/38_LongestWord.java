import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder longest = new StringBuilder();

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest.setLength(0);
                longest.append(word);
            }
        }

        System.out.println(longest);
    }
}
