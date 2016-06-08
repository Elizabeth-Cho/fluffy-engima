package gamepieces;

import mainclasses.Sprite;

public class Boulder{
	
	private boolean isThrown;
	
	public Boulder()
	{
		isThrown = false;
	}
	
	public boolean throwIt()
	{
		isThrown = !isThrown;
		return isThrown;
	}
	
	public boolean getStat()
	{
		return isThrown;
	}
}
