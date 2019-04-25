package display.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LeftMenu extends JPanel{
	
	public static Dimension size;
	Color backGroundColor;
	public LeftMenu()
	{
		backGroundColor = new Color(153, 187, 193);
		size = new Dimension(125,this.getHeight());
		this.setPreferredSize(size);
		this.setBackground(backGroundColor);
		this.add(new JButton("PlaceHolder"));
	}
}
