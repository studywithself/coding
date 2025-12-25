import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[2];
        for(int i=0; i<2; i++) {
            arr[i] = sc.nextInt();
        }

        int[] count = new int[10];
        for(int j=0; j<100; j++) {
            if (arr[0]/arr[1] == 0) {
                count[arr[0]%arr[1]]++;
                break;
            } else {
                count[arr[0]%arr[1]]++;
                arr[0] = arr[0]/arr[1];
            }           
        }

        int sum = 0;
        for(int k=0; k<10; k++) {
            count[k] = count[k]*count[k];
            sum += count[k];
        }

        System.out.print(sum);
    }
}