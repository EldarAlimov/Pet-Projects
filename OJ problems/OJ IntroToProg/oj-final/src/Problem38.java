import java.util.Locale;
import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int[] S = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            S[i] -= in.nextInt();
        }
        System.out.print(S[0]);
        for (int i = 1; i < 6; i++) {
            System.out.print(" ");
            System.out.print(S[i]);
        }
    }
}
