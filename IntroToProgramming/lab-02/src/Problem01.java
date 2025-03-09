import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1st value? ");
        int a = in.nextInt();
        System.out.print("2nd value? ");
        int b = in.nextInt();
        System.out.println("Before swapping: a = " + a + "; b = " + b + ";");
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping: a = " + a + "; b = " + b + ";");
    }
}
