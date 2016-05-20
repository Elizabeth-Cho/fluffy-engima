import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUI {

	private JFrame frame;
	private JButton button;
	private JButton button2;
	private JPanel cardPanel;
	private JPanel buttonPanel;
	
	
	public GUI(){
		frame = new JFrame("Stronghold");
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(2,1));
		cardPanel = new JPanel();
		buttonPanel = new JPanel();
		button = new JButton("Test");
		button2 = new JButton("Test 2");
		frame.add(cardPanel);
		frame.add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(2,1));
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
				System.out.println("hello");
			}
			else if(x == button2){
				System.out.println("Hi");
			}
			
		}
		
	}
	
}