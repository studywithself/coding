import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int text_len = text.length();
        int count = -1;
        int count2 = -1;

        if (text.contains("ee")) {
            count = 0;
            for (int i=0; i<text_len-1; i++) {
                if (text.charAt(i) == 'e' && text.charAt(i+1) == 'e') {
                    count++;
                }
            }

            System.out.print(count + " ");
        } else {
            System.out.print("0" + " ");
        }

        if (text.contains("eb")) {
            count2 = 0;
            for (int i=0; i<text_len-1; i++) {
                if (text.charAt(i) == 'e' && text.charAt(i+1) == 'b') {
                    count2++;
                }
            }

            System.out.print(count2);
        } else {
            System.out.print("0");
        }
    }
}