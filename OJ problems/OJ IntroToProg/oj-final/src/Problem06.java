import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int h = a*a + b*b;
        for (int i = 0; i < n; i++) {
            int c = in.nextInt();
            if (c*c <= h) System.out.println("DA");
            else System.out.println("NE");
        }

    }
}
