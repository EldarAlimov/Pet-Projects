import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        int s = 0;
        while (a != 0){
            System.out.print("Enter an integer (the input ends if it is 0): ");
            a = in.nextInt();
            s += a;
        }
        System.out.println("The sum is " + s);
    }
}
