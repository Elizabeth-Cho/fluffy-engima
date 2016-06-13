package mainclasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import robotplayers.HumanPlayer;
import robotplayers.Robot;


public class Game{

	private JFrame frame;
	private JButton rw;
	private JButton moat;
	private JButton rt;
	private JButton ramparts;
	private JPanel tower;
	private JPanel tdBuffer;
	private JPanel defense;
	private JPanel bufferA;
	private JPanel bufferB;
	private JLabel towerA;
	private JLabel towerB;
	private JLabel towers;
	private ImageIcon towerWall;
	private ImageIcon bRW;
	private ImageIcon bMoat;
	private ImageIcon bRT;
	private ImageIcon bRamparts;
	private Robot robot;
	private Color grass;
	private Graphics2D g2d;
	
	public Game(){
		
		frame = new JFrame("Game");
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(1, 4));
		tower = new JPanel();
		tdBuffer = new JPanel();
		defense = new JPanel();
		bufferA = new JPanel();
		bufferB = new JPanel();
		grass = new Color(0, 128, 0);
		
		bRW = createImageIcon("/images/rockwall.png", "rock wall");
		bMoat = createImageIcon("/images/Water Game.jpg", "moat");
		bRT = createImageIcon("/images/rough terrain.jpg", "rough terrain");
		bRamparts = createImageIcon("/images/Ramparts.jpg", "ramparts");
		towerWall = createImageIcon("/images/Tower.png", "tower");
		
		frame.add(tower);
		frame.add(tdBuffer);
		frame.add(defense);
		frame.add(bufferA);
		frame.add(bufferB);
		
		
		tower.setLayout(new GridLayout(3,1));
		defense.setLayout(new GridLayout(4,1));
		
		rw = new JButton(bRW);
		rt = new JButton(bRT);
		ramparts = new JButton(bRamparts);
		moat = new JButton(bMoat);
		
		towerA = new JLabel(towerWall);
		towers = new JLabel(towerWall);
		towerB = new JLabel(towerWall);
		
		rw.setBackground(grass);
		rt.setBackground(grass);
		ramparts.setBackground(grass);
		moat.setBackground(grass);
		towerA.setBackground(grass);
		towerB.setBackground(grass);
		
		defense.add(rw);
		defense.add(rt);
		defense.add(ramparts);
		defense.add(moat);
		tower.setBackground(grass);
		tower.add(towerA);
		tower.add(towers);
		tower.add(towerB);
		tdBuffer.setBackground(grass);
		bufferA.setBackground(grass);
		bufferB.setBackground(grass);
		
		tower.setVisible(true);
		tdBuffer.setVisible(true);
		defense.setVisible(true);
		bufferA.setVisible(true);
		bufferB.setVisible(true);
		frame.setVisible(true);
	}
	
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			if(x == rw){
				System.out.println("hello");
			}
			else if(x == rt){
				System.out.println("Hi");
			}
			
		}
		
	}
	
	protected ImageIcon createImageIcon(String path, String description)
	{
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null)
		{
			return new ImageIcon(imgURL, description);
		}
		else
		{
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
	
}