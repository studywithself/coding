import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] arr2d = new int[N][N];

        for(int i=0; i<N; i++) {
            int value = i+1;
            for(int j=0; j<N; j++) {
                arr2d[i][j] = value;
                System.out.print(value + " ");
                value += N;
            }
            System.out.println();
        }
    }
}