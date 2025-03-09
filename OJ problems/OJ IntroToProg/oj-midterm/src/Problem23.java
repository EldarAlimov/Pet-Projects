import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        if (m > 45){
            System.out.println(h + " " + (m - 45));
        }
        else {
            if ( h > 0){
                System.out.println((h - 1) + " " + (m + 15));
            }
            else {
                System.out.println((h + 23) + " " + (m + 15));
            }
        }
    }
}