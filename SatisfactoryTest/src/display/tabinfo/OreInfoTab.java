package display.tabinfo;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

import items.resources.Ores;
import items.resources.Ores.Ore_Def;

public class OreInfoTab extends CenterTabBase{

	
	public OreInfoTab()
	{
		super();
		name = "Ores";
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(new JButton("1"));
		this.add(new JButton("2"));
	}
	public void displayOreList()
	{
		Ore_Def[] list = MainFactory.MainFactory.resources.getOreList().oreTypes;
		
		
		for(Ore_Def selected : list)
		{
			this.add(new JLabel(selected.toString()));
		}
		this.validate();
		this.getIgnoreRepaint();
		System.out.println("printed");
	}
}
