import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr2d = new int[N][M];
        int[][] arr2d2 = new int[N][M];

        for(int q=0; q<N; q++) {
            for (int w=0; w<M; w++) {
                arr2d[q][w] = sc.nextInt();
            }
        }

        for(int e=0; e<N; e++) {
            for (int r=0; r<M; r++) {
                arr2d2[e][r] = sc.nextInt();
            }
        }

        for(int a=0; a<N; a++) {
            for (int s=0; s<M; s++) {
                if(arr2d[a][s] == arr2d2[a][s]) System.out.print("0 ");
                else{System.out.print("1 ");}
            }
            System.out.println();
        }
    }
}