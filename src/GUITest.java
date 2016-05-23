import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import defenses.Moat;
import defenses.RockWall;
import interfaces.Defense;

public class GUITest {

	private JFrame frame;
	private JButton button;
	private JButton button2;
	private JPanel cardPanel;
	private JPanel buttonPanel;
	Defense moat;
	Defense rockwall;
	
	
	public GUITest(){
		moat = new Moat();
		rockwall = new RockWall();
		frame = new JFrame("Test Stuff for the Sapo");
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(2,1));
		cardPanel = new JPanel();
		buttonPanel = new JPanel();
		button = new JButton("Damage Moat");
		button2 = new JButton("Damage Rock Wall");
		frame.add(cardPanel);
		frame.add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(3,1));
		buttonPanel.add(button);
		buttonPanel.add(button2);
		button.addActionListener(new Listener());
		button2.addActionListener(new Listener());
		buttonPanel.setVisible(true);
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
			
		}
		
	}
	
}