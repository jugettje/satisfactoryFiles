package display.tabinfo;

import java.awt.Dimension;

import javax.swing.JPanel;

public class CenterTabBase extends JPanel{
	
	public static Dimension size;
	public String name;
	public CenterTabBase()
	{
		size = new Dimension(890, 628);
		this.setPreferredSize(size);
	}
	
	public String getName()
	{
		return name;
	}

	
}
