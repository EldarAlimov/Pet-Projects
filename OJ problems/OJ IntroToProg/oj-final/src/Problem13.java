import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ans = "";
        int s = 0;
        for (int i = 0; i < n; i++) {
            String a = in.next();
            int b = in.nextInt();
            if (b > s){
                s = b;
                ans = a;
            }
        }
        System.out.println(ans);
    }
}
