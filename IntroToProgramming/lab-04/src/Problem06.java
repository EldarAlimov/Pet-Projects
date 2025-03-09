import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (Math.abs(x)<=5 && Math.abs(y)<=2.5){
            System.out.printf("Point (%.1f, %.1f) is in the rectangle \n",x,y);
        }
        else {
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle \n",x,y);
        }
    }
}