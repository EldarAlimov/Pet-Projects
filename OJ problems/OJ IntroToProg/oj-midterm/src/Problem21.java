import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int f = 0;
        if (a > b){
            f = 1;
        }
        System.out.println(f);
    }
}