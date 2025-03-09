import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R1 = in.nextInt();
        int S = in.nextInt();
        int R2 = S*2 - R1;
        System.out.println(R2);
    }
}