import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if (input.contains("ee")) {
            System.out.print("Yes" + " ");
        } else {
            System.out.print("No" + " ");
        }

        if (input.contains("ab")) {
            System.out.print("Yes" + " ");
        } else {
            System.out.print("No" + " ");
        }
    }
}