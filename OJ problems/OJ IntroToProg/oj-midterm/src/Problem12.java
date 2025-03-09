import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a/10;
        a = a %10;
        System.out.println(a +""+ b);
    }
}