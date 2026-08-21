import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char target = sc.next().charAt(0);
        StringBuilder sb = new StringBuilder(str);

        int index = sb.lastIndexOf(String.valueOf(target));

        System.out.println(index);
    }
}
