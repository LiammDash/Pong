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
	      
	   
       //Final variables
	   private final static Color BACKGROUND_COLOUR = Color.BLACK;
	   private final static int TIMER_DELAY = 5;
	  
	  //Create objects
	  Ball ball;
	  Paddle paddle1, paddle2;
	  
	  //Create GameState variable
	  GameState gameState = GameState.initialising;
	  
	  //Create objects
	  public void createObjects() {
		  ball = new Ball(getWidth(), getHeight());
          paddle1 = new Paddle(Player.One, getWidth(), getHeight());
          paddle2 = new Paddle(Player.Two, getWidth(), getHeight());
	  }
	  
	  
	   
      public PongPanel() {
          setBackground(BACKGROUND_COLOUR);
          Timer timer = new Timer(TIMER_DELAY, this);
          timer.start();
      }
      
      //Loop controlling the game
      private void update() {
    	  //Create objects and then start game running
    	  switch(gameState) {
    	  case initialising : {
    		  createObjects();
    		  System.out.println("Created objects");
    		  gameState = GameState.playing;
    		  break;
    	  }
    	  case playing: {
    		  break;
    	  }
    	  case gameOver: {
    		  break;
    	  }
    	  }
      }
      
      //Paint components
      @Override
      public void paintComponent(Graphics g) {
    	  super.paintComponent(g);
          paintDottedLine(g);
    	  if(gameState != GameState.initialising) {
              paintSprite(g, ball);
              paintSprite(g, paddle1);
              paintSprite(g, paddle2);
          }
                    
      }
      
      //Paint sprite method
      private void paintSprite(Graphics g, Sprite sprite) {
          g.setColor(sprite.getColor());
          g.fillRect(sprite.getXPosition(), sprite.getYPosition(), sprite.getWidth(), sprite.getHeight());
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
  
 }