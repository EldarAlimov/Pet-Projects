import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number of points? ");
        int a = in.nextInt();
        if (100 < a) System.out.println( a + " is not in the permitted range.");
        if (90 <= a  && a <= 100) System.out.println("Grade: A");
        if (80 <= a  && a < 90) System.out.println("Grade: B");
        if (70 <= a  && a < 80) System.out.println("Grade: C");
        if (60 <= a  && a < 70) System.out.println("Grade: D");
        if ( a <= 60) System.out.println("Grade: F");
    }
}