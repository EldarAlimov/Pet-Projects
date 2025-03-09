import java.util.ArrayList;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rect(10, 10, 100, 100));
        shapes.add(new Rect(400, 400, 100, 100));
        shapes.add(new Circle(500, 10, 100));
        shapes.add(new Circle(800, 800, 100));
        System.out.print("x: ");
        int curX = in.nextInt();
        System.out.print("y: ");
        int curY = in.nextInt();
        while (curX != -1 || curY != -1){
            for (int i = 0; i < shapes.size(); i++) {
                if(shapes.get(i).contains(curX, curY)){
                    System.out.println(shapes.get(i).toString());
                }
            }
            System.out.print("x: ");
            curX = in.nextInt();
            System.out.print("y: ");
            curY = in.nextInt();
        }
    }
}
