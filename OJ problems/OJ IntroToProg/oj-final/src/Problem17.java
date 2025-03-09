import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int pow = 0;
        while(Math.pow(2,pow)<num){
            pow++;
        }
        System.out.println(pow);
    }
}
