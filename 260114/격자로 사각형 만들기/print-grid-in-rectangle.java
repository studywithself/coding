import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[10][10];

        for (int q=0; q<N; q++) {
            arr[q][0] = 1;
        }

        for (int w=1; w<N; w++) {
            arr[0][w] = 1;
        }

        for (int e=1; e<N; e++) {
            for (int r=1; r<N; r++) {
                arr[e][r] = arr[e][r-1] + arr[e-1][r-1] + arr[e-1][r];
            }
        }

        for (int t=0; t<N; t++) {
            for (int y=0; y<N; y++) {
                System.out.print(arr[t][y] + " ");
            }
            System.out.println();
        }
    }
}