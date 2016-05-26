package mainclasses;

import java.util.ArrayList;

import defenses.*;
import gamepieces.*;
import interfaces.Defense;
import robotplayers.*;

public class Field {
	ArrayList<Boulder> fieldBoulders;
	ArrayList<Boulder> towerBoulders;
	Defense moat;
	Defense ramparts;
	Defense rockwall;
	Defense roughterrain;
	Tower tower;
	Boulder boulder;
	
	public Field()
	{
		fieldBoulders = new ArrayList<Boulder>();
		towerBoulders = new ArrayList<Boulder>();
		moat = new Moat();
		ramparts = new Ramparts();
		rockwall = new RockWall();
		roughterrain = new RoughTerrain();
		tower = new Tower();
		boulder = new Boulder();
	}
	
	
	

}
