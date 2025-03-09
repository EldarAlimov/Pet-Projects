import java.util.Locale;
import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int s = in.nextInt();
        String[] P = new String[p];
        for (int i = 0; i < p; i++) {
            P[i] = in.next();
        }
        String[] S = new String[s];
        for (int i = 0; i < s; i++) {
            S[i] = in.next();
        }
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < s; j++) {
                System.out.println(P[i] + " as " + S[j]);
            }
        }
    }
}
