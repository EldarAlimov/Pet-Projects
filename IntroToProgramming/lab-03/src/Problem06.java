import java.util.Locale;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = (b * b) - (4 * a * c);
        if (d > 0){
            double r1 = (-b + Math.pow(d, 0.5))/(2 * a);
            double r2 = (-b - Math.pow(d, 0.5))/(2 * a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        if (d == 0){
            double r1 = (-b)/(2 * a);
            System.out.println("The equation has one root " + r1);
        }
        if (d<0){
            System.out.println("The equation has no real roots");

        }
    }
}
