import java.util.Random;
import java.util.Scanner;

public class Problem01 {
    public static void main(String args[]) {

        System.out.print("N:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int A[] = new int[13];

        for (int i = 0; i < a; i++) {
            Random rand = new Random();
            int f = rand.nextInt(1, 7);
            int s = rand.nextInt(1, 7);
            A[f + s]+=1;
        }

        for (int i = 2; i <= 12; i++) {
            System.out.printf("%d:%d%n", i, A[i]);
        }
    }
}
