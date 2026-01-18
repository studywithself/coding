import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String result = input;

        for (int i=0; i<input.length() - 1; i++) {
            int position = sc.nextInt();

            if (result.length() > position) {
                result = result.substring(0, position) + result.substring(position + 1);
                System.out.println(result);
            } else {
                result = result.substring(0, result.length()-1);
                System.out.println(result);
            }

            if (result.length() <= 1) {
                break;
            }
        }
    }
}