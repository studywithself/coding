import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] code = new int[4];
        int[] temp = new int[3];
        char[] cold = new char[3];

        for (int i=0; i<3; i++) {
            cold[i] = sc.next().charAt(0);
            temp[i] = sc.nextInt();

            if(temp[i]>=37 && cold[i] == 'Y') {
                code[0]++;
            } else if (temp[i]>=37 && cold[i] == 'N') {
                code[1]++;
            } else if (cold[i] == 'Y') {
                code[2]++;
            } else {
                code[3]++;
            }
        }

        for (int j=0; j<4; j++) {
            System.out.print(code[j] + " ");
        }

        if (code[0] >= 2) {
            System.out.print("E");
        }
    }
}