package gamepieces;
import java.util.ArrayList;

public class Tower {
	private int strength;
	ArrayList<Boulder> boulders;
	
	public Tower()
	{
		strength = 8;
		boulders = new ArrayList<Boulder>();
	}
	
	public int getStrength()
	{
		return strength - boulders.size();
	}
	
	public int getNumBoulders()
	{
		return boulders.size();
	}
	
	public void itGotHit()
	{
		boulders.add(new Boulder());
	}
}
