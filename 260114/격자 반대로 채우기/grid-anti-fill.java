import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];
        int N = sc.nextInt();

        int col = N-1;
        int row = N-1;
        int count = 1;
        int cnt = 1;

        for (int q=0; q<N; q++) {
            if(cnt % 2 != 0) {
                for (int j=N; j>0; j--) {
                        arr[j-1][row] = count++;
                }
                row--;
                cnt++;
            } else {
                for (int i=0; i<N; i++) {
                    arr[i][row] = count++;
                }
                row--;
                cnt++;
            }

            if (row < 0) {
                break;
            }
        }

        for (int k=0; k<N; k++){
                for (int p=0; p<N; p++) {
                    System.out.print(arr[k][p] + " ");
                }
                System.out.println();
            }
    }
}