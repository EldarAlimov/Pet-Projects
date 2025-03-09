import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        while (c > 0){
            int p = (int) Math.ceil(Math.pow(c, 0.5));
            while (c%p !=0) p++;
            System.out.printf("Minimum perimeter is %d with dimensions %d x %d%n", (p+c/p)*2, c/p, p);
            c = in.nextInt();
        }
    }
}
