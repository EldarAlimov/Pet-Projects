import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int s = 0;
            if (a < 0) a *= -1;
            if (a==0) s++;
            while (a > 0){
                a /= 10;
                s ++;
            }
            System.out.println(s);
        }
    }
}
