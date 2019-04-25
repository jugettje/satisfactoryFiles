package items;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Recipe {
	String craftedIn;
	long craftingTime;
	long amountCrafted;
	Ingredients ingredientList[];
	public Recipe(JSONObject _recipe)
	{
		craftedIn = (String)_recipe.get("craftedIn");
		craftingTime = (long)_recipe.get("craftingTime");
		amountCrafted = (long)_recipe.get("amountCrafted");
		
		JSONArray ingredientArray = (JSONArray)_recipe.get("ingredients");
		ingredientList= new Ingredients[ingredientArray.size()];
		for(int i = 0; i < ingredientArray.size(); i++)
		{
			JSONObject Selected = (JSONObject)ingredientArray.get(i);
			ingredientList[i] = new Ingredients((String)Selected.get("name"), (long)Selected.get("amountNeeded"));
		}
	}
	
	@Override
	public String toString() {
		return "\tRecipe [craftedIn=" + craftedIn + ", craftingTime=" + craftingTime + ", amountCrafted=" + amountCrafted
				+ "]";
	}

	public void printList()
	{
		System.out.println(this.toString()+"\n\t\t{");
		for(int i = 0; i < ingredientList.length; i++)
		{
			System.out.println(ingredientList[i].toString());
		}
		System.out.println("\t\t}");
	}
	
	public class Ingredients
	{
		String name;
		long amountNeeded;
		public Ingredients(String _name, long _amountNeeded)
		{
			this.name = _name;
			this.amountNeeded = _amountNeeded;
		}
		public String getName() {
			return name;
		}
		public long getAmountNeeded() {
			return amountNeeded;
		}
		@Override
		public String toString() {
			return "\t\tIngredients [name=" + name + ", amountNeeded=" + amountNeeded + "]";
		}
	}
}
