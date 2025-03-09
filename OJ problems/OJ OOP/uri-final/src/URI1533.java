import java.util.Arrays;
import java.util.Scanner;

public class URI1533 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 0){
            String[] myStringArray = in.nextLine().split(" ");
            int ans = 0;
            int a2 = 0;
            int a1 = 0;
            int ind = 0;
            for (int i = 0; i < n; i++) {
                int c = in.nextInt();
                if (c > a1){
                    ans = ind;
                    ind = i+1;
                    a2 = a1;
                    a1 = c;
                }
                else{
                    if(c > a2){
                        a2 = c;
                        ans = i+1;
                    }
                }
            }
            System.out.println(ans);
            n = in.nextInt();
        }
    }
}
