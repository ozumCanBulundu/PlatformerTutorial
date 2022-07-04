
package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


public class GamePanel extends JPanel{
    
    private double xDelta = 0;
    private double yDelta = 0;
    private double xDir = 1;
    private double yDir = 1;
    public int frames = 0;
    public long lastCheck = 0;
    
    public GamePanel(){
        
        KeyboardInputs keyboardInputs = new KeyboardInputs(this);
        MouseInputs mouseInputs = new MouseInputs(this);
        
        addKeyListener(keyboardInputs);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    
    public void changexDelta(int value){
        xDelta+= value;
        
    }
    
    public void changeyDelta (int value) {
        yDelta += value;
        
    }
    
    public void setRectPosition(int x , int y){
        this.xDelta = x;
        this.yDelta = y;
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
       
        
        
        g.fillRect((int)xDelta,(int)yDelta, 200, 50);
        
        updateRectangle();
    }
    
    public void updateRectangle(){
        xDelta += xDir;
        if (xDelta > 400 || xDelta <0) {
            xDir*=-1;
        }
        yDelta += yDir;
        if (yDelta <0 || yDelta >400) {
            yDir*=-1;
        }
    }
    
    
}
