public class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");

        if (sb1.toString().equals(sb2.toString())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
