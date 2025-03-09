import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int s = (int)Math.ceil(a /Math.sin(Math.toRadians(b)));
        System.out.println(s);
    }
}