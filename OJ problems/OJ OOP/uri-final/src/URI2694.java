import java.util.Scanner;

public class URI2694 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            String s = in.next();
            int a = Integer.parseInt(s.substring(2, 4));
            int b = Integer.parseInt(s.substring(5, 8));
            int c = Integer.parseInt(s.substring(11, 13));
            System.out.println(a + b + c);
        }

    }
}
