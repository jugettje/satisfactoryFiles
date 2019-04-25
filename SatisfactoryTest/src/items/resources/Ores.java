package items.resources;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import MainFactory.MainFactory;
import lists.idNameList.IDName_Def;


public class Ores {
	public Ore_Def oreTypes[];
	public Ores(JSONArray _Ores)
	{
		oreTypes = new Ore_Def[_Ores.size()];
		for(int i = 0; i < _Ores.size(); i++)
		{
			JSONObject Selected = (JSONObject)_Ores.get(i);
			oreTypes[i] = new Ore_Def((String)Selected.get("name"), (long)Selected.get("ID"), (long)Selected.get("stackSize"));
		}
		//generateIDElements();
	}
	
	public IDName_Def[] generateIDElements()
	{
		IDName_Def[] returnArr = new IDName_Def[oreTypes.length];
		for(int i = 0; i < oreTypes.length; i++)
		{
			returnArr[i] = new IDName_Def(oreTypes[i].getOreType(), oreTypes[i].getID());
		}
		return returnArr;
	}
	
	public void printList()
	{
		for(int i = 0; i < oreTypes.length; i++)
		{
			System.out.println(oreTypes[i].toString());
		}
	}
	
	public class Ore_Def
	{
		String oreType;
		long ID;
		long stackSize;
		public Ore_Def(String _oreType, long _ID, long _stackSize) 
		{
			this.oreType = _oreType;
			this.ID = _ID;
			this.stackSize = _stackSize;
		}
		public String getOreType() {return oreType;}
		public long getID() {return ID;}
		public long getStackSize() {return stackSize;}
		@Override
		public String toString() {
			return "Ore_Def [oreType=" + oreType + ", ID=" + ID + ", stackSize=" + stackSize + "]";
		}
		
	}
}
