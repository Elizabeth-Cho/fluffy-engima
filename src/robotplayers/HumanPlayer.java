package robotplayers;

public class HumanPlayer implements Robot
{
	String alliance;
	double robotHeight;
	int teamNumber;
	boolean hasBoulder;
	
	public HumanPlayer()
	{
		alliance = "blue";
		robotHeight = 69.0;
		teamNumber = 178;
		hasBoulder = false;
	}
	
	public HumanPlayer(String nAlliance, double nRobotHeight, int nTeamNumber)
	{
		alliance = nAlliance;
		robotHeight = nRobotHeight;
		teamNumber = nTeamNumber;
		hasBoulder = false;
	}
	
	public String getAlliance()
	{
		return alliance;
	}
	
	public void move()
	{
		//Implement this after planning, I guess
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
