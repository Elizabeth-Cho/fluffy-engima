package robotplayers;
import java.awt.event.KeyEvent;

public class HumanPlayer implements Robot
{
	String alliance;
	double robotHeight;
	int teamNumber;
	boolean hasBoulder;
	private int dx;
	private int dy;
	
	public HumanPlayer()
	{
		alliance = "blue";
		robotHeight = 69.0;
		teamNumber = 178;
		hasBoulder = false;
	}
	
	public HumanPlayer(String nAlliance, double nRobotHeight, int nTeamNumber, int x,
			int y)
	{
		alliance = nAlliance;
		robotHeight = nRobotHeight;
		teamNumber = nTeamNumber;
		hasBoulder = false;
		dx = x;
		dy = y;
	}
	
	public String getAlliance()
	{
		return alliance;
	}
	
	public void move(KeyEvent e)
	{
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT)
		{
			dx--;
		}
		if (key == KeyEvent.VK_RIGHT)
		{
			dx++;
		}
		if (key == KeyEvent.VK_DOWN)
		{
			dy++;
		}
		if (key == KeyEvent.VK_UP)
		{
			dy--;
		}
	}
	
	public boolean isHoldingBoulder()
	{
		return hasBoulder;
	}
	
	public void launch()
	{
		//Implement later
	}
	
	public double intakePower()
	{
		return 1.00;
	}
	
	public double getRobotHeight()
	{
		return robotHeight;
	}
	
	public boolean changeBoulderStat()
	{
		hasBoulder = !hasBoulder;
		return hasBoulder;
	}

	public void launchBoulder()
	{
		// Implement later
	}

}
