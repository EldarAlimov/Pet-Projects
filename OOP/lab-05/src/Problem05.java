import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Problem05 extends JFrame {

    private int column;
    private int row;
    Problem05(){
        setTitle("Move robot");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var mainPanel = new CanvasPanel();
        mainPanel.setFocusable(true);
        mainPanel.setBackground(Color.GRAY);
        this.add(mainPanel);
        row = 0;
        column = 0;

        mainPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_LEFT && column > 0)
                    column--;
                else if (e.getKeyCode() == KeyEvent.VK_RIGHT && column <7)
                    column++;
                else if (e.getKeyCode() == KeyEvent.VK_UP && row > 0)
                    row --;
                else if (e.getKeyCode() == KeyEvent.VK_DOWN && row < 7)
                    row ++;
                repaint();
            }

        });
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
            g.setColor(Color.RED);
            g.fillOval(column*rectWidth, row*rectHeight, rectWidth, rectHeight);

        }
    }
    public static void main(String[] args) {
        Problem05 frame = new Problem05();
    }
}