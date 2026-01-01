import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int endPoint = N;
        while (endPoint > 0) {

            int max_point = -1;
            int max = Integer.MIN_VALUE;
            for (int j=0; j<endPoint; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    max_point = j;
                }
            }

            System.out.print((max_point+1) + " ");
            endPoint = max_point;

            if (endPoint == 0) break;
        }
    }
}