import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p = in.nextDouble(), a = in.nextDouble();
        int y = in.nextInt();
        double b = in.nextDouble();
        while(a < b) {
            a *= (1.0 + (p / 100));
            y ++;
        }
        System.out.println(y);
    }
}
