import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double s = 0;
        int c = a;
        for (int i = 0; i < a; i++) {
            int d = in.nextInt();
            if (d == -1) c -=1;
            else {
                s = s + d;
            }
        }
        if (c == 0) System.out.println(0);
        else {
            System.out.println(s / c);
        }
    }
}
