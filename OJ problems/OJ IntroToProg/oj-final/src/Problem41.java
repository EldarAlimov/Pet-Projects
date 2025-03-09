import java.util.Locale;
import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] M = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        double s = 0.0;
        for (int i = 0; i < 10; i++) {
            s+=M[i];
        }
        for (int i = 0; i < n; i++) {
            s-= M[in.nextInt()-1];
        }
        double av = s/n;
        if(in.nextInt()>=av) System.out.println("deal");
        else System.out.println("no deal");
    }
}
