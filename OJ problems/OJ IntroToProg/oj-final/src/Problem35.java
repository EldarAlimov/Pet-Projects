import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casper = bestFish(in.nextInt());
        int natalie = bestFish(in.nextInt());
        if (casper > natalie) System.out.println("Casper");
        else if (natalie > casper) System.out.println("Natalie");
        else System.out.println("Tie");
    }
    public static int bestFish(int n){
        int best = 0;
        for (int i = 0; i < n; i++) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            if (a*b > best) best = a*b;
        }
        return best;
    }
}
