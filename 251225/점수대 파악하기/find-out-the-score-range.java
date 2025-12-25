import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;
        int[] scoreArr = new int[11];

        for (int i=0; i<100; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == 0) {
                break;
            } else {
                count++;
            }
        }

        for (int j=0; j<count; j++) {
            scoreArr[(arr[j]/10)]++;
        }

        for (int k=10; k>0; k--) {
            System.out.println((k*10) + " - " + scoreArr[k]);
        }
    }
}