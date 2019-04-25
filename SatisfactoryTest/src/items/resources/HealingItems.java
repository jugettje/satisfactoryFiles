package items.resources;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class HealingItems {
	Healing_Def healingTypes[];
	public HealingItems(JSONArray _healing)
	{
		healingTypes = new Healing_Def[_healing.size()];
		for(int i = 0; i < _healing.size(); i++)
		{
			JSONObject Selected = (JSONObject)_healing.get(i);
			healingTypes[i] = new Healing_Def((String)Selected.get("name"), (long)Selected.get("ID"), (long)Selected.get("stackSize"));
		}
	}
	
	public void printList()
	{
		for(int i = 0; i < healingTypes.length; i++)
		{
			System.out.println(healingTypes[i].toString());
		}
	}
	public class Healing_Def
	{
		String healingType;
		long ID;
		long stackSize;
		public Healing_Def(String _healingType, long _ID, long _stackSize) 
		{
			this.healingType = _healingType;
			this.ID = _ID;
			this.stackSize = _stackSize;
		}
		public String getFloraType() {
			return healingType;
		}
		public long getID() {
			return ID;
		}
		public long getStackSize() {
			return stackSize;
		}
		@Override
		public String toString() {
			return "Healing_Def [healingType=" + healingType + ", ID=" + ID + ", stackSize=" + stackSize + "]";
		}
	}
}
