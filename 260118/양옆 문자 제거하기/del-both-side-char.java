import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        System.out.print(input.substring(0,2) + input.substring(3, input.length()-2) + input.substring(input.length()-1));
    }
}