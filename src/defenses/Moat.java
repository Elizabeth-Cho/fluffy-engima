package defenses;

import interfaces.Defense;

public class Moat implements Defense{
	int strength;
	String type;
	boolean breached;
	
	public Moat()
	{
		strength = 2;
		type = "Moat";
		breached = false;
	}

	public int getStrength() {
		return strength;
	}

	@Override
	public boolean isBreached() {
		if (strength > 0)
		{
			return false;
		}
		else
		{
			//System.out.println("Moat has been breached.");
			return true;
		}
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
			System.out.println("The moat cannot be damaged any further");
		}
	}
	
	public void reset()
	{
		strength = 2;
		breached = false;
	}
	

}
