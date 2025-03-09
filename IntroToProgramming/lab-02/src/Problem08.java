import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double p = in.nextDouble();
        double k = p * 0.454;
        System.out.println(p + " pounds is " + k + " kilograms");
    }
}
