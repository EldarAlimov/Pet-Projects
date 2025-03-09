import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Length in inches? ");
        int a = in.nextInt();
        double b = a * 2.54;
        System.out.println(a + " in. = " + b + "cm.");
    }
}
