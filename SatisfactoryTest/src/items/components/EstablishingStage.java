package items.components;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import items.ItemDefinition;
import items.Recipe;
import lists.idNameList.IDName_Def;

public class EstablishingStage extends Items_Components{
	public EstablishingStage(JSONArray _establishing)
	{
		itemDef = new ItemDefinition[_establishing.size()];
		for(int i = 0; i < _establishing.size(); i++)
		{
			JSONObject selected = (JSONObject)_establishing.get(i);
			itemDef[i] = new ItemDefinition(selected);
		}
	}

	@Override
	public void printList() {
		for(int i = 0; i < itemDef.length; i++)
		{
			System.out.println(itemDef[i].toString());
			Recipe[] selected = itemDef[i].getRecipe();
			for(int j = 0; j < selected.length; j++)
			{
				selected[j].printList();
			}
			System.out.println("\t]");
		}
		
	}

	@Override
	public IDName_Def[] generateIDElements() {
		IDName_Def[] returnArr = new IDName_Def[itemDef.length];
		for(int i = 0; i < itemDef.length; i++)
		{
			returnArr[i] = new IDName_Def(itemDef[i].getName(), itemDef[i].getID());
		}
		return returnArr;
	}

	@Override
	public ItemDefinition[] getItemDef() {
		return itemDef;
	}
	

}
