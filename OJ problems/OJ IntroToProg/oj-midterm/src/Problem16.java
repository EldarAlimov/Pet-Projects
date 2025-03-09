import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a % b == 0){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
