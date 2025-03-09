import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ArrayList<Integer> A = new ArrayList<>();
        //For some reason ^Z doesn't work. Please use ^D instead.
        int s = 0;
        while (in.hasNext()){
            int a = in.nextInt();
            if (a%2==0){
                A.add(0);
                s++;
            }
            A.add(a);
            s++;
        }
        System.out.println("After insertions: ");
        System.out.println(A);
        for (int i = 0; i < s; i++) {
            if (A.get(i)%2 == 1) {
                A.remove(i);
                s--;
                i--;
            }
        }
        System.out.println("After deletions: ");
        System.out.println(A);

    }
}
