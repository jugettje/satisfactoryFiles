package items.resources;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class FloraAndFauna {
		Flora_Def floraTypes[];
		public FloraAndFauna(JSONArray _Flora)
		{
			floraTypes = new Flora_Def[_Flora.size()];
			for(int i = 0; i < _Flora.size(); i++)
			{
				JSONObject Selected = (JSONObject)_Flora.get(i);
				floraTypes[i] = new Flora_Def((String)Selected.get("name"), (long)Selected.get("ID"), (long)Selected.get("stackSize"));
			}
		}
		
		public void printList()
		{
			for(int i = 0; i < floraTypes.length; i++)
			{
				System.out.println(floraTypes[i].toString());
			}
		}
	public class Flora_Def
	{
		String floraType;
		long ID;
		long stackSize;
		public Flora_Def(String _floraType, long _ID, long _stackSize) 
		{
			this.floraType = _floraType;
			this.ID = _ID;
			this.stackSize = _stackSize;
		}
		public String getFloraType() {
			return floraType;
		}
		public long getID() {
			return ID;
		}
		public long getStackSize() {
			return stackSize;
		}
		@Override
		public String toString() {
			return "Flora_Def [floraType=" + floraType + ", ID=" + ID + ", stackSize=" + stackSize + "]";
		}
	}
}
