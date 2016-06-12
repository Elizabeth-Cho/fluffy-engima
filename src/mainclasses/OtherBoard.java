package mainclasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class OtherBoard extends JPanel{
	
	private BufferedImage image;
	private BufferedImage image2;
	private BufferedImage image3;
	private BufferedImage image4;
	
	public OtherBoard()
	{
		setOpaque(true);
		setBackground(Color.GREEN);
		try {
			image = ImageIO.read(new File("/rockwall.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			image2 = ImageIO.read(new File("/images.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			image3 = ImageIO.read(new File("/images.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			image4 = ImageIO.read(new File("/images.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(image, 0, 0, null);
		g.drawImage(image2, 0, image.getHeight(), null);
		g.drawImage(image3, 0, image.getHeight() + image2.getHeight(), null);
		g.drawImage(image4, 0, image.getHeight() + image2.getHeight() + image3.getHeight(), null);
	}

}
