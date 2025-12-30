import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int k=1; k<N; k++) {
            if(min > arr[k]) {
                min = arr[k];
            }
        }

        int count = 0;
        for (int j=0; j<N; j++) {
            if (arr[j] == min) {
                count++;
            }
        }

        System.out.print(min + " " + count);
    }
}