import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if ((a > 315 && a <=360) || (a >= 0 && a <= 45)){
                System.out.println("N");
            } else if (a > 45 && a <= 135){
                System.out.println("E");
            } else if (a > 135 && a <= 225){
                System.out.println("S");
            } else if (a > 225 && a <= 315){
                System.out.println("W");
            }
        }
    }
}
