import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        String result = A;

        while (result.indexOf(B) != -1) {
            result = result.substring(0, result.indexOf(B)) + result.substring(result.indexOf(B)+B.length());
        }

        System.out.print(result);
    }
}
