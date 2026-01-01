import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<2; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[0] < arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        for (int i=2; i<N; i++) {
            int value = sc.nextInt();
            if (value > arr[0]) {
                arr[i] = arr[1];
                arr[1] = arr[0];
                arr[0] = value;
            } else if(value > arr[1]) {
                arr[1] = value;
                arr[i] = arr[1];
            } else {
                arr[i] = value;
            }
        }

        System.out.print(arr[0] + " " + arr[1]);
    }
}