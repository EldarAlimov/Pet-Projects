import java.util.Locale;
import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double b = in.nextDouble();
            double p = in.nextDouble();
            double ans = 60.0*(b/p);
            double v = 60.0 / p;
            System.out.printf("%.4f %.4f %.4f%n", ans - v,ans, ans+v);

        }
    }
}
