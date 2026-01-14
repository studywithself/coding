import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	    String[] arr = new String[N];

        for (int i=0; i<N; i++) {
            arr[i] = sc.next();
        }

        char M = sc.next().charAt(0);

        int result = 0;
        int count = 0;
        for (int i=0; i<N; i++) {
            if(arr[i].charAt(0) == M) {
                result += arr[i].length();
                count++;
            }
        }

        System.out.printf(count + " " + "%.2f", ((double)result/count));
    }
}