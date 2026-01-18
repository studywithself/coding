import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] arr = input.toCharArray();

        char first = arr[0];
        char second = arr[1];

        for (int i=0; i<input.length(); i++) {
            if ( arr[i] == first ) 
                { arr[i] = second; }
            else if ( arr[i] == second ) 
                { arr[i] = first; }
            else {
                continue;
            }
        }

        for (int k=0; k<input.length(); k++) {
            System.out.print(arr[k]);
        }
    }
}