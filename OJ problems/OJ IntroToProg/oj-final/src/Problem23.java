import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        for (int i = 0; i < lines; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            for (int j = 0; j < n; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
