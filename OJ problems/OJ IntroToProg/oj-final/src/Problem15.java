import java.util.Locale;
import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        Locale.setDefault(Locale.US);
        for (int i = 0; i < T; i++) {
            double ans = 0;
            double c = Double.valueOf(in.next());
            int h = in.nextInt();
            String tax = in.next();

            String d = in.next();
            if (h > 40){
                h -= 40;
                ans += 40*c;
                c *=2;
            }
            ans += c*h;
            switch (tax) {
                case "B" -> ans *= 0.9;
                case "C" -> ans *= 0.8;
                case "D" -> ans *= 0.71;
                case "E" -> ans *= 0.65;
            }
            if (d.equals("y")){
                ans -= 10;
            }
            System.out.printf("%.2f %n", ans);
        }
    }
}
