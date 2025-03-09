import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int s = (a.length()-2)*2;
        System.out.print("h");
        for (int i = 0; i < s; i++) {
            System.out.print("e");
        }
        System.out.print("y");
    }
}
