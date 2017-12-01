package com.Tools;

import java.awt.*;
import javax.swing.*;
public class ImagePanel extends JPanel{

	Image image;
	public ImagePanel(Image img)
	{
		this.image=img;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
