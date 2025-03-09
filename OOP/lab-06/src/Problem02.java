import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rect r1 = new Rect(10, 10, 100, 100);
        Rect r2 = new Rect(400, 400, 100, 100);
        Circle c1 = new Circle(500, 10, 100);
        Circle c2 = new Circle(800, 800, 100);
        System.out.print("x: ");
        int curX = in.nextInt();
        System.out.print("y: ");
        int curY = in.nextInt();
        while (curX != -1 || curY != -1){
            if(r1.contains(curX, curY)){
                System.out.println(r1.toString());
            }
            if(r2.contains(curX, curY)){
                System.out.println(r2.toString());
            }
            if(c1.contains(curX, curY)){
                System.out.println(c1.toString());
            }
            if(c2.contains(curX, curY)){
                System.out.println(c2.toString());
            }
            System.out.print("x: ");
            curX = in.nextInt();
            System.out.print("y: ");
            curY = in.nextInt();
        }
    }
}
