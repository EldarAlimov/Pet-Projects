import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name?  ");
        String name = in.nextLine();
        System.out.print("Hello, " + name+"!");
    }
}
