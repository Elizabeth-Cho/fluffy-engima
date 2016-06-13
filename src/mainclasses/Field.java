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
	private int dStrength;
	private int towerB;
	private int fieldB;
	
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
		dStrength = 8;
		towerB = 0;
		fieldB = 10;
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
	
	public boolean canBeCaptured()
	{
		System.out.println(getBreached());
		return getBreached() >= 3;
		//return dStrength <= 4;
	}
	
	public int getBreached()
	{
		int numBreached = 0;
		for(int i = 0; i < defenses.size(); i++)
		{
			if(defenses.get(i).isBreached())
			{
				numBreached++;
			}
		}
		return numBreached;
	}
	
	public void damage()
	{
		dStrength--;
	}
	
	public int getStrength()
	{
		return dStrength;
	}
	
	public int getTowerBoulder()
	{
		return towerB;
	}
	
	public int getFieldBoulder()
	{
		return fieldB;
	}
	public void hit()
	{
		towerB++;
		fieldB--;
	}
	
	public void reset()
	{
		towerB = 0;
		fieldB = 10;
		for(int i = 0; i < 4; i++)
		{
			defenses.get(i).reset();
		}
	}
	public boolean getNumBreached()
	{
		int numBreach = 0;
		for(int i = 0; i < 4; i++)
		{
			if(defenses.get(i).getStrength() == 0)
			{
				numBreach++;
			}
		}
		if(numBreach > 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
