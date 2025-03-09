import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.nextInt()));
        System.out.println(isPalindrome(in.nextInt()));
    }
    public static int reverse(int number){
        int ans = 0;
        while (number > 9){
            ans += number%10;
            ans *= 10;
            number /= 10;
        }
        ans += number;
        return ans;
    }
    public static boolean isPalindrome(int number){
        boolean ans = false;
        if (number == reverse(number)) ans = true;
        return ans;
    }
}
