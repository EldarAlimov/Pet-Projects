import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((x*x+y*y) <= 100){
            System.out.printf("Point (%.1f, %.1f) is in the circle \n",x,y);
        }
        else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle \n",x,y);
        }
    }
}
