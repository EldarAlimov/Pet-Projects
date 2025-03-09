import java.util.Locale;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double ans = 999999999.0;
        for (int i = 0; i < n; i++) {
            double a = in.nextDouble();
            if (a < ans) ans = a;
        }
        System.out.println(ans);
    }
}
