import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1st double? ");
        double a = in.nextDouble();
        System.out.print("2nd double? ");
        double b = in.nextDouble();
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " % " + b + " = " + (a%b));
    }
}