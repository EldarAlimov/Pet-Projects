import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int f = 0;
        if (a / 10000 == 555){
            f = 1;
        }
        System.out.println(f);
    }
}
