import java.util.Scanner;

public class URI1168 {
    static final int[] test = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] out = new int[n+1];
        for (int i = 0; i <= n; i++) {
            String a = in.nextLine();
            int d = 0;
            for (int j = 0; j < a.length(); j++) {
                d+=test[Character.getNumericValue(a.charAt(j))];
            }
            out[i] = d;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(out[i+1] + " leds");
        }
    }
}
