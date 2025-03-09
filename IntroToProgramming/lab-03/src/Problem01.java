import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("some real number? ");
        double a = in.nextDouble();
        if (a < 0){
            System.out.println("|" + a + "|  = " + (a-2*a));
        }
        else {
            System.out.println("|" + a + "|  = " + a);

        }
    }


}
