import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[100];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] question = new int[100];
        int[] answer = new int[100];
        for (int j=0; j<Q; j++) {
            question[j] = sc.nextInt();
            
            if (question[j] == 1) {
                int a = 0;
                a = sc.nextInt();
                answer[j] = arr[a-1];
                System.out.println(answer[j]);
            } 
            
            else if (question[j] == 2) {
                int b = 0;
                int count = 1;
                int position = -1;
                b = sc.nextInt();
                for (int k=0; k<N; k++) {
                    if(arr[k] == b) {
                        position = k;
                        break;
                    } else {
                        count++;
                    }
                }

                if (position == -1) {
                    System.out.println("0");
                } else {
                    System.out.println(count);
                }
                
            } 
            
            else if (question[j] == 3) {
                int s = 0;
                int e = 0;

                s = sc.nextInt();
                e = sc.nextInt();

                for (int k=(s-1); k<(e); k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}