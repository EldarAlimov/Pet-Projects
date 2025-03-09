import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            int f = in.nextInt();
            int s = p*5 - f*3;
            if (s > 40){
                ans++;
            }
        }
        if (ans == n){
            System.out.println(ans + "+");
        } else{
            System.out.println(ans);
        }
    }
}
