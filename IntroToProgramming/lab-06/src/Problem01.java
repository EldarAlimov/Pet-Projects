import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your coordinate: ");
        int a = in.nextInt();
        System.out.print("Coordinate of 1st point: ");
        int b1 = in.nextInt();
        System.out.print("Coordinate of 2nd point: ");
        int b2 = in.nextInt();
        if (Math.abs(a - b1) < Math.abs(a - b2)){
            System.out.println("1st point is closer. Distance " + Math.abs(a - b1));
        } else if (Math.abs(a - b1) > Math.abs(a - b2)) {
            System.out.println("2nd point is closer. Distance " + Math.abs(a - b2));
        } else {
            System.out.println("Same distance " + Math.abs(a - b1));
        }
    }
}