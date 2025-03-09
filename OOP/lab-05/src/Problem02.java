import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Problem02 extends JFrame {
    Problem02(){
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

        var redButton = new JButton("RED");
        redButton.addActionListener(e -> mainPanel.setBackground(Color.RED));

        var greenButton = new JButton("GREEN");
        greenButton.addActionListener(e -> mainPanel.setBackground(Color.GREEN));

        var blueButton = new JButton("BLUE");
        ActionListener blueListener = e -> mainPanel.setBackground(Color.BLUE);
        blueButton.addActionListener(blueListener);

        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(blueButton);


        setVisible(true);
    }

    public static void main(String[] args) {
        Problem02 window = new Problem02();
    }
}