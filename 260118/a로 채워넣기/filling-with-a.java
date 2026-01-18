import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int input_len = input.length();
        String a = "a";
        
        String output = input.substring(0,1) + a + input.substring(2, input_len-2) + a + input.substring(input_len-1);

        System.out.println(output);
    }
}