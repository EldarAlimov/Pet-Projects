import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int sum = 1 - a;
            for (int j = 0; j < a; j++) {
                int b = in.nextInt();
                sum += b;
            }
            System.out.println(sum);
        }
    }
}
