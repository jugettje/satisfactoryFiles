package display.content;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class TopMenu extends JPanel{
	JMenuBar menuBar;
	JMenu menu;
	Color backGroundColor;
	public TopMenu()
	{
		menuBar = new JMenuBar();
		menu = new JMenu("PlaceHolder");
		menuBar.add(menu);
		
		backGroundColor = new Color(57, 188, 211);
		this.setBackground(backGroundColor);
		this.add(menuBar);
	}
}
