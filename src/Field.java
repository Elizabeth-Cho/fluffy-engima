import java.util.ArrayList;

import defenses.*;
import gamepieces.*;
import interfaces.Defense;
import robotplayers.*;

public class Field {
	ArrayList<Boulder> fieldBoulders;
	ArrayList<Boulder> towerBoulders;
	Defense a;
	Defense b;
	Tower tower;
	Boulder boulder;
	
	public Field()
	{
		fieldBoulders = new ArrayList<Boulder>();
		a = new Moat(); //Change to options later
		b = new RockWall(); //Same with this one
	}
	
	
	

}
