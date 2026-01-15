import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int A_len = A.length();
        int B_len = B.length();
        int count = 0;
        
        for (int i=0; i + B_len <= A_len; i++) {

            if (B.charAt(0) != A.charAt(i)) {
                continue;
            }

            boolean Matched = true;

            for (int j=1; j < B_len; j++) {
                if (B.charAt(j) != A.charAt(j+i)) {
                    Matched = false;
                    break;
                }
            }

            if(Matched) {
                count++;
            }
        }

        System.out.print(count);
    }
}