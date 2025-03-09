import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if(isPrime(in.nextInt())) System.out.println(1);
            else System.out.println(0);
        }
    }
    public static boolean isPrime (int a){
        boolean f = true;
        if (a > 3){
            for (int i = 2; i <= Math.pow(a, 0.5); i++) {
                if (a % i == 0) f = false;
            }
        }
        if (a==1) f = false;
        return f;
    }
}
