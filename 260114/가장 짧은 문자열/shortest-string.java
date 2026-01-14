import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        String C = sc.next();

        int[] arr = new int[]{A.length(), B.length(), C.length()};
        int max = arr[0];
        for (int i=0; i<3; i++) {
            if (arr[i] > max) {max = arr[i];}
        }

        int min = arr[0];
        for (int i=0; i<3; i++) {
            if (arr[i] < min) {min = arr[i];}
        }

        int result = max-min;

        System.out.print(result);
    }
}