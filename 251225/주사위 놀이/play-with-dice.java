import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] count = new int[7];

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int k=0; k<10; k++) {
            count[arr[k]]++;
        }

        for(int j=1; j<7; j++) {
            System.out.println(j + " - " + count[j]);
        }
    }
}