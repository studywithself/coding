import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    String[] arr = new String[10];

        for (int i=0; i<10; i++) {
            arr[i] = sc.next();
        }

        char key = sc.next().charAt(0);
        int count = -1;

        for (int i=0; i<10; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == key) {
                System.out.println(arr[i]);
                count++;
            } 
            
            
        }

        if(count == -1) {
                System.out.println("None");
            }
    }
}