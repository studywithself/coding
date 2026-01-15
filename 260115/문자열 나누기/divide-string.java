import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String str = "";

        for (int i=0; i<N; i++) {
            str += sc.next();
        }

        for (int j=1; j<str.length()+1; j++) {
            if (j % 5 == 0) {
                System.out.println(str.charAt(j-1));
            } else {
                System.out.print(str.charAt(j-1));
            }
        }
    }
}