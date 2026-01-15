import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String strA = A+B;
        String strB = B+A;

        char[] a = strA.toCharArray();
        char[] b = strB.toCharArray();

        int count = 0;
        if (strA.length() == strB.length()) {
            for (int i=0; i<strA.length(); i++) {
                if (a[i] == b[i]) {
                    count++;
                } else {
                    break;
                }
            }

            if (strA.length() == count) {
                System.out.print("true");
            } else {
                System.out.print("false");
            }
        }
    }
}