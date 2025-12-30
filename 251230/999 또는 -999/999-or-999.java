import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int count = 0;
        for (int i=0; i<100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == -999 || arr[i] == 999) {
                break;
            } else {
                count++;
            }
        }

        int min = arr[0];
        int max = arr[0];
        for (int k=0; k<count; k++) {
            if(min > arr[k]) {
                min = arr[k];
            }

            if(max < arr[k]) {
                max = arr[k];
            }
        }

        System.out.print(max + " " + min);
    }
}