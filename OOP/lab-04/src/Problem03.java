import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ArrayListInt A = new ArrayListInt();
        ArrayListInt B = new ArrayListInt();
        int d = 0;
        //For some reason ^Z doesn't work. Please use ^D instead.
        while(in.hasNext()){
            int z = in.nextInt();
            A.add(z);
            B.add(z);
            d++;
        }
        System.out.println("Before reversing: ");
        B.printArray();
        for (int i = 0; i < d/2; i++) {
            int c = A.get(d-i-1);
            B.remove(d-i-1);
            B.add(d-i-1, A.get(i));
            B.remove(i);
            B.add(i, c);
        }
        System.out.println("After reversing: ");
        B.set(B.size()-1, A.get(0));
        B.printArray();

        int d1 = d;
        for (int i = 0; i < d1; i++) {
            if(A.get(i)%2==0){
                A.add(i, 0);
                d++;
                i++;
            }
        }

        System.out.println("After insertions: ");
        A.printArray();
        for (int i = 0; i < d; i++) {
            if (A.get(i)%2 == 1) {
                A.remove(i);
                d--;
                i--;
            }
        }
        System.out.println("After deletions: ");
        A.printArray();
    }
}
