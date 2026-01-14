import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] arr = new String[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < N; i++) {
            count += arr[i].length();
            if (arr[i].charAt(0) == 'a') {
                count2++;
            }
        }
        System.out.print(count + " ");
        System.out.println(count2);
    }
}

