import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] new_arr = new int[N];


        int min = Integer.MAX_VALUE;
        int point = 0;
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();

            if (min > arr[i]) {
                min = arr[i];
                point = i;
            }
        }

        int value = 0;
        for (int q=point; q<N; q++) {
            new_arr[q] = arr[q] - min;

            if (new_arr[q] > value) {
                value = new_arr[q];
            }
        }

        System.out.print(value);
    }
}