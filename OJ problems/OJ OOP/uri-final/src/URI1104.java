import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class URI1104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        while (n1 != 0 && n2 != 0){
            ArrayList<Integer> array1 = new ArrayList<>();
            ArrayList<Integer> array2 = new ArrayList<>();
            for (int i = 0; i < n1; i++) {
                array1.add(in.nextInt());
            }
            for (int i = 0; i < n2; i++) {
                array2.add(in.nextInt());
            }
            int ans1 = 0;
            for (int i = 0; i < n1; i++) {
                if(!array2.contains(array1.get(i))) ans1++;
            }
            int ans2 = 0;
            for (int i = 0; i < n2; i++) {
                if(!array1.contains(array2.get(i))) ans2++;
            }
            if(ans1 > ans2) ans1 = ans2;
            System.out.println(ans1);
            n1 = in.nextInt();
            n2 = in.nextInt();
        }
    }
}
