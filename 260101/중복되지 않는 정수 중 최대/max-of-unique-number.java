import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] count = new int[1001];

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }
        
        int max = -1;
        for (int j=0; j<1000; j++) {
            if (count[j] == 1) {
                if (j > max) {
                    max = j;
                }
            }
        }

        System.out.print(max);
    }
}