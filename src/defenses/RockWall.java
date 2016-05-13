package defenses;

import interfaces.Defense;

public class RockWall implements Defense{
	
	int strength;
	String type;
	boolean breached;
	
	public RockWall()
	{
		strength = 2;
		type = "Rock Wall";
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
