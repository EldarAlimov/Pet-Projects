import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Problem01 extends JFrame {
    Problem01(){
        setTitle("First GUI App");
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        var mainPanel = new JPanel();
        var backgroundColor = Color.RED;
        mainPanel.setBackground(backgroundColor);
        var controlPanel = new JPanel();
        controlPanel.setBackground(Color.DARK_GRAY);

        add(mainPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);


        controlPanel.add(new JButton("RED"));
        controlPanel.add(new JButton("GREEN"));
        controlPanel.add(new JButton("BLUE"));


        setVisible(true);
    }

    public static void main(String[] args) {
        Problem01 window = new Problem01();
    }
}
