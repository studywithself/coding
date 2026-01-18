import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String front = sc.next();
        String front_text = front.substring(0,2);

        String end = sc.next();

        String result = front_text + end.substring(2);

        System.out.print(result);
    }
}