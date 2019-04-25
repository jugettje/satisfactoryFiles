package display.base;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TestWindow extends JFrame{
	BasePanel basePanel;
	public TestWindow()
	{
		basePanel = new BasePanel();
		this.setResizable(false);
		this.setSize(1028,730);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Factory calculations");
		this.setContentPane(basePanel);
		this.setVisible(true);
	}
	
	public class BasePanel extends JPanel
	{
		JPanel leftMenu, rightInfo, topMenu;
		JMenuBar bar;
		JTabbedPane tabs;
		public BasePanel()
		{
			tabs = new JTabbedPane();
			
			bar = new JMenuBar();
			JMenu menu = new JMenu("PlaceHolder");
			bar.add(menu);
			bar.add(Box.createHorizontalGlue());
			//this.setBackground(new Color(255,0,0));
			this.setLayout(new BorderLayout());
			topMenu = new JPanel();
			//topMenu.setPreferredSize(new Dimension(topMenu.getWidth(), 50));
			topMenu.setBackground(new Color(100,100,100));
			topMenu.add(bar);
			
			
			leftMenu = new JPanel();
			//BoxLayout layout = new BoxLayout(this, BoxLayout.X_AXIS);
			leftMenu.setPreferredSize(new Dimension(125,leftMenu.getHeight()));
			leftMenu.setBackground(new Color(0,0,255));
			leftMenu.add(new JButton("PlaceHolder"));
			
			rightInfo = new JPanel();
			rightInfo.setPreferredSize(new Dimension(this.getWidth() - leftMenu.getWidth(), this.getHeight()));
			rightInfo.setBackground(new Color(0));
			
			JPanel tab1 = new JPanel(new BorderLayout());
			//tab1.setBackground(new Color(255,255,255));
			//System.out.println( + " " + rightInfo.getY());
			tab1.setPreferredSize(new Dimension(890 , 628));
			
			JPanel tab2 = new JPanel(new BorderLayout());
			tabs.add("Ores",tab1);
			tabs.add("Machines",tab2);
			
			
			rightInfo.add(tabs);
			this.add(leftMenu, BorderLayout.WEST);
			this.add(rightInfo, BorderLayout.CENTER);
			this.add(topMenu,BorderLayout.NORTH);
		}
	}
}
