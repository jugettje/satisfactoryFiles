package display.content;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import display.base.FactoryCalculatorFrame;
import display.tabinfo.Tabs;

public class CenterInfo extends JPanel{

	public Tabs tabs;
	Dimension size;
	Color backGroundColor;
	public CenterInfo()
	{
		tabs = new Tabs();
		backGroundColor = new Color(0);
		size = new Dimension(FactoryCalculatorFrame.size.width - LeftMenu.size.width,0);
		this.setPreferredSize(size);
		this.setBackground(backGroundColor);
		this.add(tabs);
	}
	
	
	public Tabs getTabs() {
		return tabs;
	}
}
