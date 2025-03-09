import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int a2 = a;
        int ans = 0;
        while (a <= b){
            int s = 2;
            for (int i = 2; i < a; i++) {
                if (a % i == 0){
                    s++;
                }
            }
            if (s == 4) ans++;
            a++;
        }
        System.out.printf("The number of RSA numbers between %d and %d is %d%n", a2, b, ans);
    }
}
