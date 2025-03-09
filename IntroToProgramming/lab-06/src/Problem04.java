import java.util.Locale;
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        System.out.print("A = ");
        int a = in.nextInt();
        System.out.print("B = ");
        int b = in.nextInt();
        if (a !=0 && b !=0){
            System.out.printf("GCD(%d, %d) = %d\n", a, b, GCD(a, b));
        }else{
            System.out.printf("GCD(%d, %d) is not defined.\n", a, b);
        }
    }
    public static int GCD(int a, int b){
        int ans = 1;
        for (int i = 1; i <= a && i <=b; i++) {
            if(a%i == 0 && b%i==0) ans = i;
        }
        return ans;
    }
}
