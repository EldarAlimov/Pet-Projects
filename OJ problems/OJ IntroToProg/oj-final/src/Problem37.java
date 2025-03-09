import java.util.Locale;
import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        int ans = 0;
        while (s <= e){
            int r = rotate(s);
            if(dd(s) & r == s) ans++;
            s++;
        }
        System.out.println(ans);
    }
    public static boolean dd(int a){
        boolean f = false;
        while (a > 0){
            int b = a%10;
            switch(b){
                case 2: case 3: case 4: case 5: case 7:
                    return false;
            }
            a /=10;
        }

        return true;
    }
    public static int rotate(int a){
        int b = 0;
        while (a>0){
            if (a%10 == 6) b+=9;
            else if (a%10 == 9)b+=6;
            else{
                b+= a%10;
            }

            a/=10;
            b*=10;
        }
        return b/10;
    }
}
