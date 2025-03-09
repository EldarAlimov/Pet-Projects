import java.util.Arrays;
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three integers ");
        int[] A = new int[3];
        A[0] = in.nextInt();
        A[1] = in.nextInt();
        A[2] = in.nextInt();
        System.out.print("The integers in non-decreasing order: ");
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

    }
}
