import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            int l = in.nextInt();
            int d = in.nextInt();
            System.out.println(l + " " + (d*(d+1)/2+d));
        }
    }
}
