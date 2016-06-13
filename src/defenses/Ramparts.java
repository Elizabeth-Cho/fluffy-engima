package defenses;

import interfaces.Defense;

public class Ramparts implements Defense{
	
	int strength;
	String type;
	boolean breached;
	
	public Ramparts()
	{
		strength = 2;
		type = "Ramparts";
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
		if (strength > 0)
		{
			strength--;
		}
		else
		{
			System.out.println("The ramparts cannot be damaged any further");
		}
	}
	
	public void reset()
	{
		strength = 2;
		breached = false;
	}

}
