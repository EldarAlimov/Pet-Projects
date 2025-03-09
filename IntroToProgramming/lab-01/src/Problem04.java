import java.util.Scanner;
public class Problem04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1st int? ");
        int a = in.nextInt();
        System.out.print("2nd int? ");
        int b = in.nextInt();
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " % " + b + " = " + (a%b));
    }
}
