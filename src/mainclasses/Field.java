package mainclasses;

import java.util.ArrayList;

import defenses.*;
import gamepieces.*;
import interfaces.Defense;
import robotplayers.*;

public class Field {
	ArrayList<Boulder> fieldBoulders;
	ArrayList<Boulder> towerBoulders;
	ArrayList<Defense> defenses;
	Defense moat;
	Defense ramparts;
	Defense rockwall;
	Defense roughterrain;
	Tower tower;
	HumanPlayer person;
	
	public Field()
	{
		fieldBoulders = new ArrayList<Boulder>();
		for(int i = 0; i < 10; i++)
		{
			fieldBoulders.add(new Boulder());
		}
		towerBoulders = new ArrayList<Boulder>();
		moat = new Moat();
		ramparts = new Ramparts();
		rockwall = new RockWall();
		roughterrain = new RoughTerrain();
		defenses = new ArrayList<Defense>();
		defenses.add(moat);
		defenses.add(ramparts);
		defenses.add(rockwall);
		defenses.add(roughterrain);	
		tower = new Tower();
	}
	
	public int getFieldBoulders()
	{
		return fieldBoulders.size();
	}
	
	public int getTowerBoulders()
	{
		return towerBoulders.size();
	}
	
	public int getRobotBoulders()
	{
		return person.getBoulders();
	}
	
	public void transferBoulder(ArrayList<Boulder> first, ArrayList<Boulder> last)
	{
		last.add(first.remove(0));
	}
	
	

}
