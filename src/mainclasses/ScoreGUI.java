package mainclasses;

import java.awt.GridLayout;

import javax.swing.*;

public class ScoreGUI {
	
	private JFrame frame;
	private JPanel individual;
	private JPanel total;
	private JLabel boulders;
	private JLabel defenses;
	private JLabel totalScore;
	
	
	public ScoreGUI()
	{
		frame = new JFrame("Score");
		frame.setSize(800, 600);
		individual = new JPanel();
		total = new JPanel();
		
		frame.setLayout(new GridLayout(2, 1));
		
		frame.add(individual);
		frame.add(total);
		
		individual.setVisible(true);
		total.setVisible(true);
		frame.setVisible(true);
	}

}
