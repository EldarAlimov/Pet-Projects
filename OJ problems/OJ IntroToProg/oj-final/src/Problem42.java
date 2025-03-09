import java.util.Locale;
import java.util.Scanner;

public class Problem42 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int[] test = {0, 10000, 20000, 30000, 40000, 50000};
        int[] ans = {0, 0, 0, 0, 0, 0};
        int a = in.nextInt();
        while(a != -1){
            int d = 0;
            for (int i = 0; i < 6; i++) {
                if(a >= test[i]) d++;
            }
            ans[d-1]++;
            a = in.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(ans[i]);
        }


    }
}
