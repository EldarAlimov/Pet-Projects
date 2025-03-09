import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double c = in.nextDouble();
        double f = (1.8*c +32);
        if (c%1 == 0){
            System.out.printf("%.0f", c);
        }
        else {
            System.out.print(c);
        }
        System.out.print(" Celsius is ");
        System.out.printf("%.1f", f);
        System.out.println(" Fahrenheit");
    }
}