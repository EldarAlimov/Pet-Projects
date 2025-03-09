import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double G = in.nextInt();
        int T = in.nextInt();
        int N = in.nextInt();
        G = G - T;
        G = G * 0.9;
        for (int i = 0; i < N; i++) {
            G = G - in.nextInt();
        }
        System.out.println((int)G);
    }
}
