	import java.awt.Color;
   import java.awt.event.ActionEvent;
   import java.awt.event.ActionListener;
   import java.awt.event.KeyEvent;
   import java.awt.event.KeyListener;
   import javax.swing.Timer;
   import javax.swing.JPanel;
   import java.awt.Graphics;
   import java.awt.Graphics2D;
   import java.awt.Stroke;
   import java.awt.BasicStroke;
   import java.awt.Graphics2D;
   
   public class PongPanel extends JPanel implements ActionListener, KeyListener {
	   boolean gameInitialised = false;
	   
	   
       //Final vars
	   private final static Color BACKGROUND_COLOUR = Color.BLACK;
	   private final static int TIMER_DELAY = 5;
	  
	  //Create ball object
	  Ball ball;
	  
	  //Create a new ball for the game
	  public void createObjects() {
	         ball = new Ball(getWidth(), getHeight());
	  }
	  
	  
	   
      public PongPanel() {
          setBackground(BACKGROUND_COLOUR);
          Timer timer = new Timer(TIMER_DELAY, this);
          timer.start();
      }
      
      //Loop controlling the game
      private void update() {
    	  //Create objects and then start game running
    	  if(!gameInitialised) {
              createObjects();
              gameInitialised = true;
         }
      }
      
      //Paint the canvas to default state
      @Override
      public void paintComponent(Graphics g) {
    	  if(gameInitialised) {
              paintSprite(g, ball);
          }
          super.paintComponent(g);
          paintDottedLine(g);          
      }
      
      //Paint sprite method
      private void paintSprite(Graphics g, Sprite sprite) {
          g.setColor(sprite.getColor());
          g.fillRect(sprite.getXPosition(), sprite.getYPosition(), sprite.getWidth(), sprite.getHeight());
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
    	  update();
    	  repaint();
      }
      
      //Draw divider
      private void paintDottedLine(Graphics g) {
          Graphics2D g2d = (Graphics2D) g.create();
             Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
             g2d.setStroke(dashed);
             g2d.setPaint(Color.WHITE);
             g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
             g2d.dispose();
     }
  
 }