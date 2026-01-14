import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != ' ') {
                System.out.print(A.charAt(i));
            }
        }

        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) != ' ') {
                System.out.print(B.charAt(i));
            }
        }
    }
}