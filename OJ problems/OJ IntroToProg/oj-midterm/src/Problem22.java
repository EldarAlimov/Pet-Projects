import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 2 == 0){
            System.out.println("Bob");
        }
        else{
            System.out.println("Alice");
        }
    }
}
