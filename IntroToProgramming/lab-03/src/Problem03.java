import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1st number? ");
        int a = in.nextInt();
        System.out.print("2st number? ");
        int b = in.nextInt();
        if (b >a) a = b;
        System.out.print("3st number? ");
        int c = in.nextInt();
        if (c > a) a = c;
        System.out.println("The value " + a + " is the greatest one.");
    }
}