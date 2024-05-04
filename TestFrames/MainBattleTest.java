package TestFrames;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class MainBattleTest extends JFrame{
    
    JPanel mainPanel = new JPanel();
    final int WIDTH = 800, HEIGHT = 600;

    public MainBattleTest() {
        setSize(WIDTH, HEIGHT);
        setTitle("testBattle");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        mainPanel.setBackground(Color.blue);
        mainPanel.setBounds(0, 0, WIDTH, HEIGHT);
    }
}
