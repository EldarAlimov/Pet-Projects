import java.util.Locale;
import java.util.Scanner;
public class URI1217 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        in.useLocale(Locale.US);
        int n = in.nextInt();
        int[] fr = new int[n];
        double sum = 0;
        double f = 0;
        for (int i = 0; i < n; i++) {
            double g = in.nextDouble();
            in.nextLine();
            String s = in.nextLine();
            fr[i] = (s.length() - s.replaceAll(" ", "").length())+1;
            sum+=g;
            f+=fr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("day %d: %d kg\n", i+1, fr[i]);
        }
        double d = f/n*1.0;
        System.out.printf("%.2f kg by day\n", d);
        d = sum/n;
        System.out.printf("R$ %.2f by day\n", d);

    }
}
