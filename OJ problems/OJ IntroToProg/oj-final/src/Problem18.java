import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int side = 0;
        while(side*side<a){
            side++;
        }if(side*side>a){
            side--;
        }
        System.out.println("The largest square has side length " + side + ".");
    }
}
