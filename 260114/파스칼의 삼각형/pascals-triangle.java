import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[15][15];

        for (int i=0; i<N; i++) {
            arr[i][0] = 1;
        }

        for (int j=1; j<N; j++) {
            arr[j][j] = 1;
        }

        for (int q=2; q<N; q++) {
            for (int w=1; w<N; w++) {
                if (arr[q][w+1] == 1) {
                    arr[q][w] = arr[q-1][w-1] + arr[q-1][w];
                    break;
                } else {
                    arr[q][w] = arr[q-1][w-1] + arr[q-1][w];
                }
            }
        }

        for (int a=0; a<N; a++) {
            for (int s=0; s<=a; s++) {
                System.out.print(arr[a][s] + " ");
            }
            System.out.println();
        }
    }
}