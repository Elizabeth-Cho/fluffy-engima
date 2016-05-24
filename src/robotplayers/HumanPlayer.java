package robotplayers;
import java.util.ArrayList;

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
	
	public void move()
	{
		System.out.println("Vroom vroom");
	}
	public boolean isHoldingBoulder()
	{
		return hasBoulder;
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

	public void pickUpBoulder()
	{
		boulders.add(new Boulder());
	}
	
	public void launchBoulder()
	{
		boulders.remove(0);
		boulders.get(0).throwIt();
	}

}
