package main;


public class Game implements Runnable{
    
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private Thread gameThread;
    private final int fps_Set = 120;
    
    public Game() {
        
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
        StartGameLoop();
    }
    
    private void StartGameLoop(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    
    
    @Override
    public void run() {
        
        double timePerFrame = 1000000000 / fps_Set; //nanosecond
        long now = System.nanoTime();
        long lastFrame = now;
        int frames = 0;
        long lastCheck = 0;
        
        while(true){
            
            now = System.nanoTime();
            
            if (now - lastFrame >= timePerFrame) {
                
                gamePanel.repaint();
                lastFrame = now;
                frames++;
            }
            
            
             
        
            if (System.currentTimeMillis() - lastCheck >= 1000) {
            
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS:" + frames);
                frames = 0;
        }
        }
        
    }
}
