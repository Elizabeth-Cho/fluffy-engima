package mainclasses;
import interfaces.Defense;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import defenses.Moat;
import defenses.Ramparts;
import defenses.RockWall;
import defenses.RoughTerrain;

import javax.swing.*;
import javax.swing.JFrame;

public class GUI {

	private JFrame frame;
	private JButton side1button1;
	private JButton side1button2;
	private JButton side1button3;
	private JButton side1button4;
	private JButton side2button1;
	private JButton side2button2;
	private JButton side2button3;
	private JButton side2button4;
	private JPanel cardPanel;
	private JPanel buttonPanel;
	private JPanel anotherPanel1;
	private JPanel anotherPanel2;
	private JPanel anotherPanel3;
	Defense ramparts;
	Defense moat;
	Defense roughterrain;
	Defense rockwall;
	Defense ramparts2;
	Defense moat2;
	Defense roughterrain2;
	Defense rockwall2;
	
	
	
	public GUI(){
		ramparts = new Ramparts();
		moat = new Moat();
		roughterrain = new RoughTerrain();
		rockwall = new RockWall();
		ramparts2 = new Ramparts();
		moat2 = new Moat();
		roughterrain2 = new RoughTerrain();
		rockwall2 = new RockWall();
		
		
		frame = new JFrame("Stronghold");
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(1, 5));
		cardPanel = new JPanel();
		buttonPanel = new JPanel();
		anotherPanel1 = new JPanel ();
		anotherPanel2 = new JPanel ();		
		anotherPanel3 = new JPanel ();
		
		side1button1 = new JButton("Ramparts");
		side1button2 = new JButton("Moat");
		side1button3 = new JButton("Rough Terrain");
		side1button4 = new JButton("Rock Wall");
		
		side2button1 = new JButton("Ramparts");
		side2button2 = new JButton("Moat");
		side2button3 = new JButton("Rough Terrain");
		side2button4 = new JButton("Rock Wall");
		
		frame.add(anotherPanel1);
		frame.add(cardPanel);
		frame.add(anotherPanel2);
		frame.add(buttonPanel);
		frame.add(anotherPanel3);
		
		buttonPanel.setLayout(new GridLayout(4, 1));
		buttonPanel.add(side1button1);
		buttonPanel.add(side1button2);
		buttonPanel.add(side1button3);
		buttonPanel.add(side1button4);
		
		cardPanel.setLayout(new GridLayout(4, 1));
		cardPanel.add(side2button1);
		cardPanel.add(side2button2);
		cardPanel.add(side2button3);
		cardPanel.add(side2button4);
		
		side1button1.addActionListener(new Listener());
		side1button2.addActionListener(new Listener());
		side1button3.addActionListener(new Listener());
		side1button4.addActionListener(new Listener());
		
		side2button1.addActionListener(new Listener());
		side2button2.addActionListener(new Listener());
		side2button3.addActionListener(new Listener());
		side2button4.addActionListener(new Listener());
		
		buttonPanel.setVisible(true);
		cardPanel.setVisible(true);
		frame.setVisible(true);
	}

	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			
			if(x == side1button1){
				ramparts.breach();
				ramparts.isBreached();
				
			}
			else if(x == side1button2){
				moat.breach();
				moat.isBreached();
			}
			else if(x == side1button3){
				roughterrain.breach();
				roughterrain.isBreached();
			}
			
			else if(x == side1button4){
				rockwall.breach();
				rockwall.isBreached();
			}
			
			else if (x == side2button1){
				ramparts2.breach();
				ramparts2.isBreached();
			}
			else if(x == side2button2){
				moat2.breach();
				moat2.isBreached();
			}
			else if(x == side2button3){
				roughterrain2.breach();
				roughterrain2.isBreached();
			}
			
			else if(x == side2button4){
				rockwall2.breach();
				rockwall2.isBreached();
			}
			
		}
	
		
		
		
		
		public class MovObj extends JPanel implements ActionListener{
			
			Timer t;
			double x;
			double y;
			double velX;
			double velY;
			
			public void actionPerformed(ActionEvent f) {
			
				Timer t = new Timer(5, this);
				double x = 0;
				double y = 0;
				double velX = 2;
				double velY = 2;
				}
				
				public void paintComponent (Graphics g){
					super.paintComponent(g);
					Graphics2D g2 = (Graphics2D) g;
					Ellipse2D circle = new Ellipse2D.Double (x, y, 40, 40);
					g2.fill(circle);
					t.start();
				}
				
				public void actionPerformed2 (ActionEvent e){
					x += velX;
					y += velY;
					repaint();
				}
				
			}	
			
		}
		
		
		/*public class Macheads{
			public static void main (String args[]){
			second s = new second();
			JFrame f = new JFrame();
			f.add(s);
			f.setVisibile
			}
		}*/

		
	
	
}