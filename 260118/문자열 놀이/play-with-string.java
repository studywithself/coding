import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] arr = input.toCharArray();

        int query = sc.nextInt();

        for (int i=0; i<query; i++) {
            int mode = sc.nextInt();
            String result = "";

            if (mode == 1) {
                int target = sc.nextInt();
                int place = sc.nextInt();
                
                char temp = ' ';
                temp = arr[target-1];
                arr[target-1] = arr[place-1];
                arr[place-1] = temp;
            }

            else if (mode == 2) {
                char text = sc.next().charAt(0);
                char change = sc.next().charAt(0);

                for (int k=0; k<arr.length; k++) {
                    if (arr[k] == text) {
                        arr[k] = change;
                    }
                }
            }

            else {
                break;
            }

            for (int j=0; j<arr.length; j++) {
                    result += arr[j];
                }

            System.out.println(result);
        }
    }
}