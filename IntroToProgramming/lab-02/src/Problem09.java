import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int m = in.nextInt();
        int d = (int) Math.round((m/60.0)/24.0);
        int y = (int) Math.floor(d/365.0);
        d = d - y*365;
        System.out.println(m + " minutes is approximately " + y + " years and " + d + " days");
    }
}
