import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        
        String str = sc.nextLine();
        int N = str.length();
        char chr = sc.next().charAt(0);

        for (int i=0; i<N; i++) {
            if(str.charAt(i) == chr) {
                count++;
            }
        }
        
        System.out.print(count);
    }
}