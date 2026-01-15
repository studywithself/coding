import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        String input = sc.next();

        int result = text.indexOf(input);
        
        if (result == -1) {
            System.out.print("No");
        } else {
            System.out.print(result);
        }
    }
}

