import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Problem04 {
    static ArrayList<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        shapes.ensureCapacity(5);
        shapes.add(new Rect(10, 10, 100, 100));
        shapes.add(new Rect(400, 400, 100, 100));
        shapes.add(new Circle(500, 10, 100));
        shapes.add(new Circle(800, 800, 100));
        shapes.add(new Cross(200, 600, 10, 50));
        System.out.print("cmd: ");
        String cmd = in.nextLine();
        while (!Objects.equals(cmd, "stop")){
            switch (cmd){
                case "present":
                    present();
                    break;
                case "click":
                    System.out.print("x: ");
                    int x = in.nextInt();
                    System.out.print("y: ");
                    int y = in.nextInt();
                    click(x, y);
                    in.nextLine();
                    break;
                case "move":
                    System.out.print("x1: ");
                    int x1 = in.nextInt();
                    System.out.print("y1: ");
                    int y1 = in.nextInt();
                    System.out.print("x2: ");
                    int x2 = in.nextInt();
                    System.out.print("y2: ");
                    int y2 = in.nextInt();
                    move(x1, y1, x2, y2);
                    in.nextLine();
                    break;
                default:
                    System.out.println();
                    break;
            }
            System.out.print("cmd: ");
            cmd = in.nextLine();
        }
    }
    public static void click(int x, int y){
        for (int i = 0; i < shapes.size(); i++) {
            if(shapes.get(i).contains(x, y)){
                System.out.println(shapes.get(i).toString());
                return;
            }
        }
    }
    public static void move(int x1, int y1, int x2, int y2){
        for (int i = 0; i < shapes.size(); i++) {
            if(shapes.get(i).contains(x1, y1)){
                shapes.get(i).setX(shapes.get(i).getX()+(x2-x1));
                shapes.get(i).setY(shapes.get(i).getY()+(y2-y1));
                return;
            }
        }
    }
    public static void present(){
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).toString());
        }
    }
}
