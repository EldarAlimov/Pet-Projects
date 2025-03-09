import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Problem04 extends JFrame {
    Problem04(){
        setTitle("Chessboard");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var mainPanel = new CanvasPanel();
        mainPanel.setBackground(Color.WHITE);


        this.add(mainPanel);
    }
    class CanvasPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g ){
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();
            int rectWidth = width/8;
            int rectHeight = height/8;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    Color c = (i + j)%2 == 0 ? Color.BLACK : Color.WHITE;
                    g.setColor(c);
                    g.fillRect(i*rectWidth, j*rectHeight, rectWidth, rectHeight);
                }
            }
        }
    }
    public static void main(String[] args) {
        Problem04 frame = new Problem04();
    }
}
