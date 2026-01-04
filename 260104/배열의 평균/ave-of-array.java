import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int[2][4];

        int all = 0;
        int first_row = 0;
        int second_row = 0;
        

        for (int q=0; q<2; q++) {
            for (int w=0; w<4; w++) {
                arr2d[q][w] = sc.nextInt();
                all += arr2d[q][w];
                if(q==0) first_row += arr2d[q][w];
                else second_row += arr2d[q][w];
            }
        }

        double first_col = (arr2d[0][0] + arr2d[1][0]) / 2.0;
        double second_col = (arr2d[0][1] + arr2d[1][1]) / 2.0;
        double third_col = (arr2d[0][2] + arr2d[1][2]) / 2.0;
        double forth_col = (arr2d[0][3] + arr2d[1][3]) / 2.0;
        double allsum = all / 8.0;
        double first_row_sum = first_row / 4.0;
        double second_row_sum = second_row / 4.0;

        System.out.printf("%.1f %.1f", first_row_sum, second_row_sum);
        System.out.println();
        System.out.printf("%.1f %.1f %.1f %.1f", first_col, second_col, third_col, forth_col);
        System.out.println();
        System.out.printf("%.1f", allsum);
    }
}