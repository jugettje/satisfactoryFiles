package display.base;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import display.content.LeftMenu;
import display.content.CenterInfo;
import display.content.TopMenu;
import display.tabinfo.OreInfoTab;
import display.tabinfo.Tabs;
import display.tabinfo.CenterTabBase;
import display.tabinfo.MachineInfoTab;




public class FactoryCalculatorFrame extends JFrame{
	BasePanel basePanel;
	public static Dimension size;
	JPanel leftMenu, topMenu;
	JPanel centerInfo;
	public FactoryCalculatorFrame()
	{
		size = new Dimension(1028, 730);
		basePanel = new BasePanel();
		this.setResizable(false);
		this.setSize(FactoryCalculatorFrame.size.width , FactoryCalculatorFrame.size.height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Factory calculations");
		this.setContentPane(basePanel);
		this.setVisible(true);
		
		this.passPannelToCenterTabs(new OreInfoTab());
		this.passPannelToCenterTabs(new MachineInfoTab());
	}
	
	public JPanel getCenterInfo() {
		return centerInfo;
	}
	
	public Tabs getCenterInfoTabs() {
		return ((Tabs)((CenterInfo) centerInfo).getTabs());
	}

	public void passPannelToCenterTabs(CenterTabBase _tab)
	{
		((Tabs)((CenterInfo) centerInfo).getTabs()).addPanel(_tab);
	}
	
	public class BasePanel extends JPanel
	{
		public BasePanel()
		{
			this.setLayout(new BorderLayout());
			leftMenu = new LeftMenu();
			centerInfo = new CenterInfo();
			topMenu = new TopMenu();
			
			this.add(leftMenu, BorderLayout.WEST);
			this.add(centerInfo, BorderLayout.CENTER);
			this.add(topMenu, BorderLayout.NORTH);
		}
		public JPanel getCenterInfo() {
			return centerInfo;
		}
		
		
	}
}
