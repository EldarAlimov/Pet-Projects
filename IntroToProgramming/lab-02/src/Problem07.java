import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double r = in.nextDouble();
        double l = in.nextDouble();
        double S = r * r * Math.PI;
        double V = S * l;
        System.out.println("The area is " + S);
        System.out.println("The volume is " + V);



    }
}
