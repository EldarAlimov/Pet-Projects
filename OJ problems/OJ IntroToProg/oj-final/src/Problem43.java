import java.util.Locale;
import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int[] row1 = new int[4];
        int[] row2 = new int[4];
        int[] row3 = new int[4];
        int[] row4 = new int[4];

        for (int i = 0; i < 4; i++) {
            row1[i] = in.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            row2[i] = in.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            row3[i] = in.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            row4[i] = in.nextInt();
        }
        int test = sum(row1);
        boolean f = true;
        f = sum(row2) == test & sum(row2) == test & sum(row3) == test & sum(row4) == test;
        if(f){
            for (int i = 0; i < 4; i++) {
                f = test == (row1[i] + row2[i] + row3[i] + row4[i]);
            }
            if(f){
                f = (row1[0] + row2[1] + row3[2] + row4[3])==test & (row1[3] + row2[2] + row3[1] + row4[0])==test;
                if(f) {
                    System.out.println("magic");
                }else{
                    System.out.println("not magic");
                }
            }else{
                System.out.println("not magic");
            }
        }else{
            System.out.println("not magic");
        }

    }
    public static int sum(int[] A){
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum+=A[i];
        }
        return sum;
    }
}
