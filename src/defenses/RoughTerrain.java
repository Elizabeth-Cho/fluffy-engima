package defenses;

import interfaces.Defense;

public class RoughTerrain implements Defense{
	
	int strength;
	String type;
	boolean breached;
	
	public RoughTerrain()
	{
		strength = 2;
		type = "Rough Terrain";
		breached = false;
	}

	public int getStrength() {
		return strength;
	}

	@Override
	public boolean isBreached() {
		return (strength > 0);
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void breach() {
		//Implement later
	}

}
