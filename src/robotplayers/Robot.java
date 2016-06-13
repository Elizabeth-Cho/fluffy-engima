package robotplayers;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Robot {
	
	private int dx;
	private int dy;
	private int x;
	private int y;
	private Image image;
	
	public Robot()
	{
		initRobot();
	}
	
	private void initRobot()
	{
		ImageIcon ii = new ImageIcon("/images/smol.png", "robot");
		image = ii.getImage();
		x = 40;
		y = 60;
	}
	
	public void move()
	{
		x += dx;
		y += dy;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public Image getImage()
	{
		return image;
	}
	
	 public void keyPressed(KeyEvent e) {

	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {
	            dx = -1;
	        }

	        if (key == KeyEvent.VK_RIGHT) {
	            dx = 1;
	        }

	        if (key == KeyEvent.VK_UP) {
	            dy = -1;
	        }

	        if (key == KeyEvent.VK_DOWN) {
	            dy = 1;
	        }
	    }
	 
	 public void keyReleased(KeyEvent e)
	 {
		 int key = e.getKeyCode();
		 
		 if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)
		 {
			 dx = 0;
		 }
		 if(key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN)
		 {
			 dy = 0;
		 }
	 }
}
