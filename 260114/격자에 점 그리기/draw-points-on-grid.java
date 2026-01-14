import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 1;

        int[][] arr = new int[N][N];

        for (int i=0; i<M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[A-1][B-1] = count++;
        }

        for (int j=0; j<N; j++) {
            for (int k=0; k<N; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
    }
}