import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Temperature in degrees Fahrenheit? ");
        int f = in.nextInt();
        double c = (f-32)*5/9.0;
        System.out.print("The temperature in degrees Celsius is ");
        System.out.printf("%.2f", c);
    }
}
