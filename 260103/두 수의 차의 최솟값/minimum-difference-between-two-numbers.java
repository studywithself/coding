import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int min = 0;

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int minmin = Integer.MAX_VALUE;
        for (int q=0; q<N-1; q++) {
            
            min = arr[q+1] - arr[q];

            if (min < minmin) {
                minmin = min;
            }
        }

        System.out.print(minmin);
    }
}