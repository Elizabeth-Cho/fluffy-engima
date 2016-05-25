import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import defenses.Moat;
import defenses.RockWall;
import interfaces.Defense;
import robotplayers.HumanPlayer;

public class GUITest {

	private JFrame frame;
	
	private JButton button;
	private JButton button2;
	private JButton button3;
	
	private JButton up;
	private JButton down;
	private JButton left;
	private JButton right;
	
	private JButton horn;
	private JButton pushit;
	
	private JPanel cardPanel;
	private JPanel buttonPanel;
	private JPanel movementPanel;
	
	Defense moat;
	Defense rockwall;
	Tower tower;
	HumanPlayer vroomvroom;
	
	
	public GUITest(){
		//Game components
		moat = new Moat();
		rockwall = new RockWall();
		tower = new Tower();
		vroomvroom = new HumanPlayer();
		
		//GUI components
		frame = new JFrame("Test Stuff for the Sapo");
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(3,1));
		
		/*cardPanel.setLayout(new GridLayout(1,1));
		cardPanel.add(horn);*/
		
		cardPanel = new JPanel();
		buttonPanel = new JPanel();
		movementPanel = new JPanel();
		
		frame.add(cardPanel);
		frame.add(buttonPanel);
		frame.add(movementPanel);
		
		button = new JButton("Damage Moat");
		button2 = new JButton("Damage Rock Wall");
		button3 = new JButton("Throw Boulder");
		buttonPanel.setLayout(new GridLayout(3,1));
		buttonPanel.add(button);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		button.addActionListener(new Listener());
		button2.addActionListener(new Listener());
		button3.addActionListener(new Listener());
		
		horn = new JButton("HORN");
		pushit = new JButton("lol I dare you boi");
		up = new JButton("Up");
		down = new JButton("Down");
		left = new JButton("Left");
		right = new JButton("Right");		
		movementPanel.setLayout(new GridLayout(3, 3));
		movementPanel.add(pushit);
		movementPanel.add(horn);
		movementPanel.add(up);
		movementPanel.add(down);
		movementPanel.add(left);
		movementPanel.add(right);
		up.addActionListener(new Listener());
		down.addActionListener(new Listener());
		left.addActionListener(new Listener());
		right.addActionListener(new Listener());
		horn.addActionListener(new Listener());
		pushit.addActionListener(new Listener());
		
		buttonPanel.setVisible(true);
		movementPanel.setVisible(true);
		cardPanel.setVisible(true);
		frame.setVisible(true);
	}
	
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			if(x == button){
				moat.breach();
				moat.isBreached();
				//System.out.println("hello");
			}
			else if(x == button2){
				rockwall.breach();
				rockwall.isBreached();
				//System.out.println("Hi");
			}
			else if(x == button3){
				tower.itGotHit();
				if (tower.getStrength() == -69)
				{
					System.out.println("Horn ~.^");
				}
				else
				{
					System.out.println("The tower has a strength of " + tower.getStrength());
				}
				
			}
			else if(x == up)
			{
				System.out.println("Robot has moved forward");
				vroomvroom.move();
				
			}
			else if(x == down)
			{
				System.out.println("Robot has moved backward");
				vroomvroom.move();
			}
			else if(x == left)
			{
				System.out.println("Robot has moved left");
				vroomvroom.move();
			}
			else if(x == right)
			{
				System.out.println("Robot has moved right");
				vroomvroom.move();
			}
			else if(x == horn)
			{
				int random = (int)(Math.random() * 50);
				if (0 < random && random < 25)
				{
					System.out.println("Mr. Horn is ready to see you now ;)");
				}
				else if (random == 25)
				{
					System.out.println("Festive Horn");
				}
				else
				{
					System.out.println("It's all rainbows and unihorns");
				}
				System.out.println("lolololololololololololololololololololololololol");	
			}
			else if(x == pushit)
			{
				System.out.println("Don't do it. Bad. Go away.");
			}
			
		}
		
	}
	
}