import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] under_arr = new int[10];
        int[] upper_arr = new int[10];

        int up = 0;
        int under = 0;
        for (int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > 500) {
                upper_arr[up] = arr[i];
                up++;
            } else {
                under_arr[under] = arr[i];
                under++;
            }
        }

        int under_max = under_arr[0];
        int upper_max = upper_arr[0];

        for (int q=0; q<up; q++) {
            if (upper_max > upper_arr[q]) {
                upper_max = upper_arr[q];
            }
        }

        for (int w=0; w<under; w++) {
            if (under_max < under_arr[w]) {
                under_max = under_arr[w];
            }
        }

        System.out.print(under_max + " " + upper_max);
    }
}