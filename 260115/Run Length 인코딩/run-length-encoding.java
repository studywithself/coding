import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String str = "";
        int loop = A.length();
        int count = 1;

        for (int i=0; i<loop; i++) {
            if (i+1 < A.length() && A.charAt(i) == A.charAt(i+1)) {
                count++;
            } else {
                str += A.charAt(i);
                str += Integer.toString(count);
                count = 1;
            }
        }

        System.out.println(str.length());
        System.out.print(str);
    }
}