
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
}
