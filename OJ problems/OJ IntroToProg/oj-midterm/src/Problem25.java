import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int f = -1;
        f = a.indexOf("ss");
        if (f == -1){
            System.out.println("no hiss");
        }
        else {
            System.out.println("hiss");
        }
    }
}