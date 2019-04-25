package items.components;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import items.Recipe;

public class EstablishingStage {
	Establishing_Def establishingTypes[];
	public EstablishingStage(JSONArray _establishing)
	{
		establishingTypes = new Establishing_Def[_establishing.size()];
		for(int i = 0; i < _establishing.size(); i++)
		{
			JSONObject Selected = (JSONObject)_establishing.get(i);
			establishingTypes[i] = new Establishing_Def(Selected);
		}
	}
	
	public void printList()
	{
		for(int i = 0; i < establishingTypes.length; i++)
		{
			System.out.println(establishingTypes[i].toString());
			Recipe[] Selected = establishingTypes[i].getRecipe();
			for(int j = 0; j < Selected.length; j++)
			{
				Selected[j].printList();
			}
			System.out.println("\t]");
		}
	}
	
	public class Establishing_Def
	{
		String name;
		long ID;
		long stackSize;
		Recipe recipe[];
		public Establishing_Def(JSONObject _inputItem)
		{
			this.name = (String)_inputItem.get("name");
			this.ID = (long)_inputItem.get("ID");
			this.stackSize = (long)_inputItem.get("stackSize");
			JSONArray recipeList = (JSONArray)_inputItem.get("recipe");
			recipe = new Recipe[recipeList.size()];
			for(int i = 0; i < recipeList.size(); i++)
			{
				recipe[i] = new Recipe((JSONObject)recipeList.get(i));
			}
		}
		public String getName() {
			return name;
		}
		public long getID() {
			return ID;
		}
		public long getStackSize() {
			return stackSize;
		}
		public Recipe[] getRecipe() {
			return recipe;
		}
		@Override
		public String toString() {
			return "Establishing_Def \n\t[\n\tname=" + name + ",\n\tID=" + ID + ",\n\tstackSize=" + stackSize ;
		}
	}
}
