import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int N = sc.nextInt();
        int count = 0;
        int position = 0;

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int k=0; k<N; k++) {
            if (arr[k] == 2) {
                count++;
                position = k;
            }

            if (count == 3) {
                System.out.print(position+1);
                break;
            }
        }
    }
}