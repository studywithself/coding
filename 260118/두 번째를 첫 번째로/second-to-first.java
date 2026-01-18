import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] arr = input.toCharArray();
        char first = arr[0];
        char target = arr[1];

        for (int i=0; i<input.length(); i++) {
            if(arr[i] == target) {
                arr[i] = first;
            } else {
                continue;
            }
        }

        System.out.print(String.valueOf(arr));
    }
}