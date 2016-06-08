package mainclasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

import interfaces.Robot;
import robotplayers.HumanPlayer;

public class Board extends JPanel implements ActionListener{
	
	private Timer timer;
	private HumanPlayer human;
	private final int DELAY = 10;
	
	public Board()
	{
		initBoard();
	}

	public void initBoard()
	{
		addKeyListener(new TAdapter());
		setBackground(Color.GREEN);
		setFocusable(true);
		human = new HumanPlayer();
		timer = new Timer(DELAY, this);
		timer.start();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		doDrawing(g);
		Toolkit.getDefaultToolkit().sync();
	}
	
	public void doDrawing(Graphics g)
	{
		Graphics2D gr = (Graphics2D) g;
		gr.drawImage(human.getImage(), human.getX(), human.getY(), this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		human.move();
		repaint();		
	}
	
	public class TAdapter extends KeyAdapter
	{
		public void keyReleased(KeyEvent e)
		{
			human.keyReleased(e);
		}
		public void keyPressed(KeyEvent e)
		{
			human.keyPressed(e);
		}
	}
	

}
