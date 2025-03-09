
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int m = in.nextInt();
        int l = in.nextInt();
        if (s+m*2+l*3 >=10) System.out.println("happy");
        else System.out.println("sad");

    }
}