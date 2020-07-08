
public class Sprite {
	//Create variables
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private int initialXPosition, initialYPosition;
	
	//Return Variables
	
	//Returns pos/velocity
	public int getXPosition() { return xPosition; }
	public int getYPosition() { return yPosition; }
	public int getXVelocity() { return xVelocity; }
	public int getYVelocity() { return yVelocity; }
	//Return width and height
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	//Set variables
	
	//Set initial positions
	public void setInitialPosition(int initialX, int initialY) {
		initialXPosition = initialX;
		initialYPosition = initialY;
	}
	
	//Reset to intial positions
	public void resetToInitialPositions() {
		setXPosition(initialXPosition);
		setYPosition(initialYPosition);
	}
	
	//Set positions
	//Set x pos
	public void setXPosition(int newX, int panelWidth) {
		xPosition = newX;
	       if(xPosition < 0) {
	           xPosition = 0;
	       } else if(xPosition + width > panelWidth) {
	           xPosition = panelWidth - width;
	       }
	}
	//Set y pos
	public void setYPosition(int newY, int panelHeight) {
		yPosition = newY;
	      if(yPosition < 0) {
	          yPosition = 0;
	      } else if(yPosition + height > panelHeight) {
	          yPosition = panelHeight - height;
	      }
	}
	
	//Two more set x and y pos, use method with only one param to access these, two params will access methods above
	public void setXPosition(int newX) {
		xPosition = newX;
	}
	public void setYPosition(int newY) {
		yPosition = newY;
	}
	
	//Set velocity
	//Set x velocity
	public void setXVelocity(int newXVelocity) {
		xVelocity = newXVelocity;
	}
	//Set y velocity
	public void setYVelocity(int newYVelocity) {
		yVelocity = newYVelocity;
	}
	
	//Set width/height
	//Set width
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	//New height
	public void setHeight(int newHeight) {
		height = newHeight;
	}
}
