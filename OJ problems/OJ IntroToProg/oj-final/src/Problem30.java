import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 2;
        for (int i = 1; i <= n && i > 0; i+=c) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n*2-i*2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i == n) c*=-1;
        }
    }
}
