package gamepieces;
public class Boulder {
	
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
}
