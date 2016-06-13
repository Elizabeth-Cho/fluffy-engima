package robotplayers;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import gamepieces.Boulder;
import interfaces.Robot;

public class HumanPlayer implements Robot
{
	String alliance;
	double robotHeight;
	int teamNumber;
	boolean hasBoulder;
	ArrayList<Boulder> boulders;
	private int dx;
	private int dy;
	private int x;
	private int y;
	private Image image;
	
	public HumanPlayer()
	{
		alliance = "blue";
		robotHeight = 24.0;
		teamNumber = 178;
		hasBoulder = false;
		initRobot();
	}
	
	public void initRobot()
	{
		ImageIcon ii = new ImageIcon("/images/robot.jpg");
		image = ii.getImage();
		x = 40;
		y = 60;
	}
	
	public void move()
	{
		x += dx;
		y += dy;
		//System.out.println("Vroom vroom");
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT)
		{
			dx = -1;
		}
		if(key == KeyEvent.VK_RIGHT)
		{
			dx = 1;
		}
		if(key == KeyEvent.VK_UP)
		{
			dy = -1;
		}
		if(key == KeyEvent.VK_DOWN)
		{
			dy = 1;
		}
	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)
		{
			dx = 0;
		}
		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN)
		{
			dy = 0;
		}
	}
	//Unused input constructor
	/*public HumanPlayer(String nAlliance, double nRobotHeight, int nTeamNumber, int x,
			int y)
	{
		alliance = nAlliance;
		robotHeight = nRobotHeight;
		teamNumber = nTeamNumber;
		hasBoulder = false;
		dx = x;
		dy = y;
	}*/
	
	//Accessor methods
	
	public String getAlliance()
	{
		return alliance;
	}
	
	public double getRobotHeight()
	{
		return robotHeight;
	}
	
	public boolean isHoldingBoulder()
	{
		return hasBoulder;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	//Mutator/other methods
	
	public double intakePower()
	{
		return 1.00;
	}
	
	public boolean changeBoulderStat()
	{
		hasBoulder = !hasBoulder;
		return hasBoulder;
	}

	public void pickUpBoulder()
	{
		if (boulders.size() == 0)
		{
			boulders.add(new Boulder());
		}
		else
		{
			System.out.println("The robot can't pick up any more boulders.");
		}
	}
	
	public void launchBoulder()
	{
		boulders.remove(0);
		boulders.get(0).throwIt();
	}
	
	public int getBoulders()
	{
		return boulders.size();
	}

	public Image getImage() {
		// TODO Auto-generated method stub
		return image;
	}

}
