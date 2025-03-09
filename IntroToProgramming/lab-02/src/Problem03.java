import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        String a = in.nextLine();
        int b = (int)(a.charAt(0))-48 + (int)(a.charAt(1))-48 + (int)(a.charAt(2))-48 + (int)(a.charAt(3))-48;
        System.out.println("The sum of all digits is " + b);
    }
}
