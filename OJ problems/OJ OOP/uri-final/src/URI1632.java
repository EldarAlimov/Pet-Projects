import java.util.Scanner;

public class URI1632 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            int ans = 1;
            s = s.toLowerCase();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 's' ||s.charAt(j) == 'a' ||s.charAt(j) == 'e' ||s.charAt(j) == 'i' ||s.charAt(j) == 'o'){
                    ans *= 3;
                }
                else{
                    ans*=2;
                }
            }
            System.out.println(ans);
        }
    }
}
