package mainclasses;

import java.util.ArrayList;

import gamepieces.Boulder;
import interfaces.Defense;
import mainclasses.Field;



public class FieldStats {
	private int numBoulders;
	private int towerStrength;
	private int towerBoulder;
	private int robotBoulder;
	private int fieldBoulder;
	Field field;
	
	public FieldStats()
	{
		field = new Field();
		/*numBoulders = field.getFieldBoulders() + field.getTowerBoulders() + field.getRobotBoulders();
		towerStrength = field.tower.getStrength();
		towerBoulder = field.getTowerBoulders();
		fieldBoulder = field.getFieldBoulders();*/
	}
	
	public int getNumBoulder()
	{
		return numBoulders;
	}
	
	public int getTowerBoulder()
	{
		return towerBoulder;
	}
	
	public int getFieldBoulder()
	{
		return fieldBoulder;
	}
	
	public int getMidScore()
	{
		int boulder = getTowerBoulder() * 5;
		int defenses = 0;
		for(int i = 0; i < field.defenses.size(); i++)
		{
			if(field.defenses.get(i).isBreached())
			{
				defenses = defenses + 2;
			}
		}
		return boulder + defenses;
	}
	
	public int getFinalScore()
	{
		int midScore = getMidScore();
		int towerScore;
		int breachScore;
		if(towerStrength <= 0)
		{
			towerScore = 10;
		}
		else
		{
			towerScore = 0;
		}
		if(field.canBeCaptured())
		{
			breachScore = 25;
		}
		else
		{
			breachScore = 0;
		}
		return midScore + towerScore;
	}

}
