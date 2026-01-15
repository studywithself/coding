import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();
        String str = "";

        for (int i=0; i<loop; i++) {
            str += sc.next();
        }

        System.out.print(str);
    }
}