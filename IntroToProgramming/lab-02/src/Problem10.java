import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p = 312032486;
        double b = 365*24*60*60/7.0;
        double d = 365*24*60*60/13.0;
        double im = 365*24*60*60/45.0;
        System.out.print("Enter the numbers of years: ");
        int y = in.nextInt();
        for (int i = 1; i <= y; i++){
            p = p + b + im - d;
        }
        System.out.println("The population in " + y + " years is " + (int)((p-(p)%1)+1));
    }
}
