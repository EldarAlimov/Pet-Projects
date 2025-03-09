import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        ArrayList<String> M = new ArrayList<String>();
        for (int i = 0; i <= a; i++) {
            String s = in.nextLine();
            if (i%2!=0) M.add(s);
        }
        for (String s : M) {
            System.out.println(s);
        }
    }
}
