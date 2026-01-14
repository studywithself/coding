import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr2d = new int[N][M];
        int count = 1;

        for (int i=0; i <= N + M - 2; i++) {
            for (int j=0; j<N; j++) {
                for (int k=0; k<M; k++) {
                    if (j+k == i) {
                        arr2d[j][k] = count++;
                    }
                }
            }
        }

        for (int q = 0; q < N; q++) {
            for (int w = 0; w < M; w++) {
                System.out.print(arr2d[q][w] + " ");
            }
            System.out.println();
        }
    }
}