import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int[3][3];
        int[][] arr2d2 = new int[3][3];

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for(int q=0; q<3; q++) {
            for(int w=0; w<3; w++) {
                arr2d2[q][w] = sc.nextInt();
            }
        }

        for(int e=0; e<3; e++) {
            for(int r=0; r<3; r++) {
                System.out.print(arr2d[e][r] * arr2d2[e][r] + " ");
            }
            System.out.println();
        }
    }
}