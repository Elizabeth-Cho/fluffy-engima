import java.util.ArrayList;

import gamepieces.Boulder;
import interfaces.Defense;

public class FieldStats {
	private int numBoulders;
	private int towerStrength;
	private int towerBoulder;
	private int robotBoulder;
	private int fieldBoulder;
	ArrayList<Defense> defenses;
	ArrayList<Boulder> fieldBoulders;
	
	public FieldStats()
	{
		numBoulders = 10;
		
	}

}
