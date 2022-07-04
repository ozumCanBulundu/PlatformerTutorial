package main;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class GameWindow {
    private JFrame jframe;
    public GameWindow(GamePanel gamePanel){
        
        jframe = new JFrame();
        
        jframe.setSize(400,400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
    }
}
