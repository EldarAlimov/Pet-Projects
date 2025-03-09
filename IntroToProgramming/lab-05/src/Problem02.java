import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Integer? ");
        int a = in.nextInt();
        int s = 0;
        while (a > 9){
            s += a % 10;
            a = a / 10;
        }
        s += a;
        System.out.println("The sum of all digits is " + s);
    }
}
