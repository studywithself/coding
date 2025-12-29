import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        
        int result = 0;
        String end = "";

        int[] A = new int[N1];
        int[] B = new int[N2];

        for (int l=0; l<N1; l++) { A[l] = sc.nextInt(); }
        for (int m=0; m<N2; m++) { B[m] = sc.nextInt(); }

        for (int i=0; i<N1-N2; i++) {
            int count = 0;
            for (int k=0; k<N2; k++) {
                if(A[i+k] == B[k]) count++;
                else break;
            }

            if (count == N2) {
                end = "Yes";
                break;    
            }
        }

        if (end == "Yes") {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}