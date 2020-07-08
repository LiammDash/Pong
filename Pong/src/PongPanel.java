	import java.awt.Color;
   import java.awt.event.ActionEvent;
   import java.awt.event.ActionListener;
   import java.awt.event.KeyEvent;
   import java.awt.event.KeyListener;
   import javax.swing.Timer;
   import javax.swing.JPanel;
   import java.awt.Graphics;
   import java.awt.Graphics2D;
   
   public class PongPanel extends JPanel implements ActionListener, KeyListener {
       
	   private final static Color BACKGROUND_COLOUR = Color.BLACK;
	   private final static int TIMER_DELAY = 5;
	   
      public PongPanel() {
          setBackground(BACKGROUND_COLOUR);
          Timer timer = new Timer(TIMER_DELAY, this);
          timer.start();
      }
      
      //Loop controlling the game
      private void update() {
          
      }
      
      //Paint the canvas to default state
      @Override
      public void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.setColor(Color.WHITE);
          g.fillRect(20, 20, 100, 100);
      }
  
      //Key pressed event
      @Override
      public void keyPressed(KeyEvent event) {
      }
  
      //Key release event
      @Override
      public void keyReleased(KeyEvent event) {
      }
  
      //Key typed event
      @Override
      public void keyTyped(KeyEvent event) {
      }
  
      //Action performed event
      @Override
      public void actionPerformed(ActionEvent event) {
      }
  
 }