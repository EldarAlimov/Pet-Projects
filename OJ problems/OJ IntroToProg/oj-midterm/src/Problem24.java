import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (b > a){
            System.out.println(a + " " + b);
        }
        else {
            System.out.println(b + " " + a);
        }
    }
}