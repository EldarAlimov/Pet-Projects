import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(modInverse(a, b));
    }

    static String modInverse(int a, int b) {

        for (int X = 1; X < b; X++)
            if (((a % b) * (X % b)) % b == 1)
                return String.valueOf(X);
        return "No such integer exists.";
    }
}
