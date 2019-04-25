package items;

import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ItemDefinition {
	String name;
	long ID;
	long stackSize;
	Recipe recipe[];
	public ItemDefinition(JSONObject _inputItem)
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
		return "ItemDefinition \n\t[\n\tname=" + name + ",\n\tID=" + ID + ",\n\tstackSize=" + stackSize;
	}
}
