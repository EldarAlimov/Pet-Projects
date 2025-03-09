import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ArrayList<Integer> A = new ArrayList<>();
        int d = 0;
        //For some reason ^Z doesn't work. Please use ^D instead.
        while(in.hasNext()){
            A.add(in.nextInt());
            d++;
        }
        System.out.println("Before reversing: ");
        System.out.println(A);
        A.subList(d, A.size()).clear();
        for (int i = 0; i < d/2; i++) {
            int c = A.get(d-i-1);
            A.remove(d-i-1);
            A.add(d-i-1, A.get(i));
            A.remove(i);
            A.add(i, c);
        }
        System.out.println("After reversing: ");
        System.out.println(A);
    }
}
