import defenses.*;
import interfaces.*;
import robotplayers.*;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame{
	
	public Application()
	{
		initUI();
	}
	
	private void initUI()
	{
		add(new Board());
		
		pack();
		
		setTitle("Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				Application test = new Application();
				test.setVisible(true);
			}
		});
		/*Defense moat = new Moat();
		Defense ramparts = new Ramparts();
		Defense rockWall = new RockWall();
		Defense roughTerrain = new RoughTerrain();
		HumanPlayer human = new HumanPlayer();*/
		
	}

}
