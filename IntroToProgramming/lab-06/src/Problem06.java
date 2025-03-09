import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(sumDigits(in.nextLong()));
    }

    public static int sumDigits(long n){
        int ans = 0;
        while (n > 9){
            ans += n%10;
            n /=10;
        }
        ans += n;
        return ans;
    }
}

