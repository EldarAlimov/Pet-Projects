import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int s = a;
        double d = 1.0;
        while (a != 0) {
            a = in.nextInt();
            s = s + a;
            d = d + 1;
        }
        if (d > 1){
            System.out.println("The arithmetic mean is " + s/(d-1));
        }
        else {
            System.out.println("Nothing to calculate");
        }
    }
}
