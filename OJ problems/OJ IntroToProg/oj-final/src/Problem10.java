import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans += n;
            n *=10;
        }
        System.out.println(ans+n);
    }
}
