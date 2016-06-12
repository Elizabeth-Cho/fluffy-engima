package mainclasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Game {

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
	private ImageIcon bRW;
	private ImageIcon bMoat;
	private ImageIcon bRT;
	private ImageIcon bRamparts;
	private ImageIcon robot;
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
		
		bRW = createImageIcon("/images/rockwall.jpg", "rock wall");
		robot = createImageIcon("/images/robot.jpg", "robot");		
		
		frame.add(tower);
		frame.add(tdBuffer);
		frame.add(defense);
		frame.add(bufferA);
		frame.add(bufferB);
		
		
		tower.setLayout(new GridLayout(3,1));
		defense.setLayout(new GridLayout(4,1));
		
		rw = new JButton(bRW);
		rt = new JButton("it's rough");
		ramparts = new JButton("flippy floppy");
		moat = new JButton("water games");
		
		defense.add(rw);
		defense.add(rt);
		defense.add(ramparts);
		defense.add(moat);
		tower.setBackground(grass);
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
	
	private void doDrawing(Graphics g)
	{
		g2d = (Graphics2D) g;
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




