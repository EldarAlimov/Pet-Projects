import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 100;
        int d = 100;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a1 = in.nextInt();
            int d1 = in.nextInt();
            if (a1 > d1){
                d = d - a1;
            }
            if (d1 > a1){
                a = a - d1;
            }
        }
        System.out.println(a);
        System.out.println(d);
    }
}
