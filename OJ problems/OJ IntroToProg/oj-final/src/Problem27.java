import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ans = 0;

            for (int j = 3; j < a; j++) {
                for (int k = 2; k < j; k++) {
                    for (int l = 1; l < k; l++) {
                        ans++;
                    }
                }
            }

        System.out.println(ans);
    }
}
