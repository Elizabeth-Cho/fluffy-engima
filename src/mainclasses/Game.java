package mainclasses;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;

public class Game {
	private JFrame frame;
	private BufferedImage picture;
	private JPanel tower;
	private JPanel defenseTowerBuffer;
	private JPanel defenses;
	private JPanel bufferA;
	private JPanel bufferB;
	
	public Game()
	{
		frame = new JFrame("Stronghold");
		frame.setSize(800, 600);
		frame.setTitle("Stronghold");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new GridLayout(5,1));
		frame.setBackground(Color.green);
		
		tower = new JPanel();
		defenseTowerBuffer = new JPanel();
		defenses = new JPanel();
		bufferA = new JPanel();
		bufferB = new JPanel();
		
		frame.add(tower);
		frame.add(defenseTowerBuffer);
		frame.add(defenses);
		frame.add(bufferA);
		frame.add(bufferB);
		
		defenses.setLayout(new GridLayout(1, 5));
		
		tower.setVisible(true);
		defenseTowerBuffer.setVisible(true);
		defenses.setVisible(true);
		bufferA.setVisible(true);
		bufferB.setVisible(true);
		
		//picture = ImageIO.read(new File("C:\\Users\\zergl\\Desktop\\Everything\\Project Images"));
	}
	
	
}
