package items.components;

import items.ItemDefinition;
import lists.idNameList.IDName_Def;

public abstract class Items_Components {
	public ItemDefinition itemDef[];
	public abstract void printList();
	public abstract IDName_Def[] generateIDElements();
	public abstract ItemDefinition[] getItemDef();
}
