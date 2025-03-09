import java.util.Scanner;

public class URI1285 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            int ans = 0;
            for (int i = n; i <= m; i++) {
                if(check(i)) ans++;
            }
            System.out.println(ans);
        }
    }
    public static boolean check(int a){
        String s = a + "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
