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
