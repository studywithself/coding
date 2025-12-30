import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i=0; i<10; i++) { 
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int k=1; k<10; k++) { 
            if(max < arr[k]) {
                max = arr[k];
            }
        }

        System.out.println(max);
    }
}