package mainclasses;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


	public class ControlGUI {

		private JFrame frame;
		private JButton up;
		private JButton down;
		private JButton left;
		private JButton right;
		private JButton boulder;
		private JButton defense;
		private JPanel cardPanel;
		private JPanel buttonPanel;
		private JButton end, reset;
		private JLabel spaceB;
		private int xLoc, yLoc, totalDamage;
		private String hit;
		private String miss;
		private String moveError;
		private boolean isEnded;
		
		Field field;
		
		public ControlGUI(){
			frame = new JFrame("Scores");
			frame.setSize(800, 300);
			frame.setLayout(new GridLayout(2,1));
			cardPanel = new JPanel();
			buttonPanel = new JPanel();
			up = new JButton("Up");
			down = new JButton("Down");
			left = new JButton("Left");
			right = new JButton("Right");
			boulder = new JButton("Throw Boulder");
			defense = new JButton("Damage Defenses");
			end = new JButton("End Game");
			reset = new JButton("Reset Game");
			spaceB = new JLabel();
			frame.add(cardPanel);
			frame.add(buttonPanel);
			buttonPanel.setLayout(new GridLayout(2,4));
			buttonPanel.add(end);
			buttonPanel.add(up);
			buttonPanel.add(reset);
			buttonPanel.add(boulder);
			buttonPanel.add(left);
			buttonPanel.add(down);
			buttonPanel.add(right);
			buttonPanel.add(defense);
			up.addActionListener(new Listener());
			down.addActionListener(new Listener());
			left.addActionListener(new Listener());
			right.addActionListener(new Listener());
			boulder.addActionListener(new Listener());
			defense.addActionListener(new Listener());
			end.addActionListener(new Listener());
			//reset.addActionListener(new Listener());
			buttonPanel.setVisible(true);
			cardPanel.setVisible(true);
			frame.setVisible(true);
			
			field = new Field();
			
			xLoc = 2;
			yLoc = 2;
			totalDamage = 0;
			hit = "The boulder hit the tower";
			miss = "The boulder missed the tower";
			moveError = "You cannot move any further";
		}
		
		private int finalScore()
		{
			int sFinal;
			int pBoulder;
			int pDefense;
			int pCapture;
			int numB = field.getTowerBoulder();
			int numD = field.getStrength();
			pDefense = (8 - numD)/2;
			pBoulder = numB * 5;
			if(field.canBeCaptured())
			{pCapture = 25;}
			else
			{pCapture = 0;}
			sFinal = pDefense + pBoulder + pCapture;
			return sFinal;
		}
		
		public int totalDamage()
		{
			for(int i = 0; i < 4; i++)
			{
				totalDamage += field.defenses.get(i).getStrength();
			}
			return totalDamage;
		}
		
		public void resetField()
		{
			xLoc = 3;
			yLoc = 3;
			totalDamage = 0;
			field.reset();
		}
		
		private class Listener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				Object x = e.getSource();
				if(x == left){
					if(xLoc == 0)
					{
						System.out.println(moveError);
					}
					else
					{
						xLoc--;
						System.out.println("(" + xLoc + "," + yLoc + ")");
					}
				}
				else if(x == right){
					if(xLoc == 3)
					{
						System.out.println(moveError);
					}
					else
					{
						xLoc++;
						System.out.println("(" + xLoc + "," + yLoc + ")");
					}
				}
				else if(x == up){
					if(yLoc == 3)
					{
						System.out.println(moveError);
					}
					else
					{
						yLoc++;
						System.out.println("(" + xLoc + "," + yLoc + ")");
					}
				}
				else if(x == down){
					if(yLoc == 0)
					{
						System.out.println(moveError);
					}
					else
					{
						yLoc--;
						System.out.println("(" + xLoc + "," + yLoc + ")");
					}
				}
				else if(x == boulder)
				{
					int r = (int)(Math.random()*10);
					if(field.getFieldBoulder() != 0){
					if(xLoc < 4 && xLoc > 1)
					{
						if(r > 5)
						{System.out.println(hit);
							field.hit();}
						else
						{System.out.println(miss);}
					}
					if(xLoc == 0 && xLoc == 1)
					{
						if(r > 3)
						{System.out.println(hit);
							field.hit();}
						else
						{System.out.println(miss);}
					}
					else
					{
						if(r > 8)
						{System.out.println(hit);
							field.hit();}
						else
						{System.out.println(miss);}
					}
					}
					else
					{
						System.out.println("There are no more boulders to throw");
					}
				}
					else if(x == defense)
					{
						if(xLoc == 1)
						{
							String name = field.defenses.get(yLoc).getType();
							//System.out.println("The defenses have been damaged");
							field.defenses.get(yLoc).breach();
							System.out.println("The " + name + " has been damaged!");
						if(field.getNumBreached())
						{
							System.out.println("The tower can be captured!");
						}
					}
					else
					{
						System.out.println("There's nothing to damage");
					}
				}
					else if(x == end)
					{
						isEnded = true;
						System.out.println();
						System.out.println();
						System.out.println("Game has been ended!");
						System.out.println("Remaining defense strength: " + totalDamage() + " out of 8");
						System.out.println("Remaining tower strength: " + (10 - field.getTowerBoulder()) + " out of 10");
						System.out.println("Final score: " + finalScore());
						/*for(int i = 0; i < 4; i++)
						{
							System.out.println(field.defenses.get(i).getType() + ": ");
							if(field.defenses.get(i).isBreached())
							{
								System.out.print("Breached!");
							}
							else
							{
								System.out.print("Not breached!");
							}
						}*/
						if(field.canBeCaptured())
						{
							System.out.println("The tower has been captured!");
						}
						else
						{
							System.out.println("The tower has not been captured!");
						}
					}
					/*else if (x == reset)
					{
						if(isEnded)
						{
							for(int i = 0; i < 5; i++)
							{
								System.out.println();
								field.reset();
								resetField();
							}
						}
						else
						{
							System.out.println("The game is in progress!");
						}
					}*/
				
			}
			
		}
		
	}