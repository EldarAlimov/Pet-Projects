import java.util.ArrayList;
import java.util.Scanner;

public class URI1318 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n = in.nextInt();
        while (t != 0 && n != 0){
            ArrayList<Integer> myArray = new ArrayList<>();
            ArrayList<Integer> testArray = new ArrayList<>();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                if(myArray.contains(a) && !testArray.contains(a)) {
                    ans ++;
                    testArray.add(a);
                }
                myArray.add(a);
            }
            System.out.println(ans);
            t = in.nextInt();
            n = in.nextInt();
        }
    }
}
