import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String str = "";
        int loop = A.length();

        for (int i=1; i<loop; i+=2) {
            str += A.charAt(i);
        }

        int loop2 = str.length();

        for (int j=loop2-1; j>=0; j--) {
            System.out.print(str.charAt(j));
        }
    }
}