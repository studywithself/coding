import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];

        for (int i=0; i<5; i++) {
            arr[i][0] = 1;
            arr[0][i] = 1;
        }

        for (int j=1; j<5; j++) {
            for (int k=1; k<5; k++) {
                arr[j][k] = arr[j][k-1] + arr[j-1][k];
            }
        }

        for (int q=0; q<5; q++) {
            for  (int w=0; w<5; w++) {
                System.out.print(arr[q][w] + " ");
            }
            System.out.println();
        }
    }
}