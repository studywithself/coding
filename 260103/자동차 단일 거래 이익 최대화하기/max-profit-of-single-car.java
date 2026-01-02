import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int gap = 0;
        int maxGap = 0;
        int min = Integer.MAX_VALUE;
        

        for (int i=0; i<N; i++) {
            int now = sc.nextInt();

            if (now < min) {
                min = now;
            }

            gap = now - min;
            if (maxGap < gap) {
                maxGap = gap;
            }
        }

        System.out.print(maxGap);
    }
}