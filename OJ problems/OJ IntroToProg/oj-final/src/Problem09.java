import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            if (year < 1989 || (year == 1989 && (month < 2 || (month == 2 && day <=27)))) {
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
    }
}
