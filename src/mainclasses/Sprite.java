package mainclasses;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean vis;
	private Image image;
	
	public Sprite(int aX, int aY)
	{
		x = aX;
		y = aY;
		vis = true;
	}
	
	protected void loadImage(String imgN)
	{
		ImageIcon ii = new ImageIcon(imgN);
		image = ii.getImage();
	}
	
	protected void getImageDimensions()
	{
		width = image.getWidth(null);
		height = image.getHeight(null);
	}
	
	public Image getImage()
	{
		return image;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public boolean isVisible()
	{
		return vis;
	}
	
	public void setVisible(boolean visible)
	{
		vis = visible;
	}

}
