import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Objects;

public class Problem05 extends JFrame {
    Problem05(){
        setTitle("Graph Editor");
        setSize(1000, 800);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        var mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        var controlPanel = new JPanel();
        controlPanel.setBackground(Color.GRAY);

        add(mainPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        var optionPanel = new JPanel();
        optionPanel.setBackground(Color.WHITE);

        var rectButton = new JButton("Rect");
        rectButton.addActionListener(e -> shapes.add(new Rect(100, 100, 100, 100)));
        controlPanel.add(rectButton);

        var circleButton = new JButton("Circle");
        rectButton.addActionListener(e -> shapes.add(new Circle(100, 100, 100)));
        controlPanel.add(circleButton);

        var crossButton = new JButton("Cross");
        rectButton.addActionListener(e -> shapes.add(new Cross(100,  100, 10, 50)));
        controlPanel.add(crossButton);

        mainPanel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                move(e.getX(), e.getY());
            }
            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        mainPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_DELETE){

                }
            }
        });



        this.add(mainPanel);
    }


    static ArrayList<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        Problem05 frame = new Problem05();
        shapes.ensureCapacity(5);

    }
    public void paint(Graphics g, Rect rect){
        g.drawRect(rect.getX(), rect.getY(), rect.getW(), rect.getH());
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
