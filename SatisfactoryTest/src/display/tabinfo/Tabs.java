package display.tabinfo;

import java.util.Vector;

import javax.swing.JTabbedPane;

public class Tabs extends JTabbedPane
{
	Vector<CenterTabBase> tabList;
	public Tabs()
	{
		tabList = new Vector<CenterTabBase>();
	}
	
	public void addPanel(CenterTabBase _panel)
	{
		tabList.add(_panel);
		loadTabs();
	}
	
	public void loadTabs()
	{
		for(CenterTabBase selected : tabList)
		{
			this.add(selected.getName(), selected);
		}
	}
	
	public OreInfoTab getOreInfoTab()
	{
		return (OreInfoTab) tabList.get(0);
	}
}
