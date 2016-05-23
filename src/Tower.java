import java.util.ArrayList;

import gamepieces.Boulder;

public class Tower {
	int strength;
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
	
	public void itGotHit()
	{
		boulders.add(new Boulder());
	}
}
