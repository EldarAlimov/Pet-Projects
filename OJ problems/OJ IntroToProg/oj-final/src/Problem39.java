import java.util.Locale;
import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int[] M1 = {461, 431, 420, 0};
        int[] M2 = {100, 57, 70, 0};
        int[] M3 = {130, 160, 118, 0};
        int[] M4 = {167, 266,75, 0};
        int sum = 0;
        sum += M1[in.nextInt()-1];
        sum += M2[in.nextInt()-1];
        sum += M3[in.nextInt()-1];
        sum += M4[in.nextInt()-1];
        System.out.printf("Your total Calorie count is %d.%n", sum);
    }
}
