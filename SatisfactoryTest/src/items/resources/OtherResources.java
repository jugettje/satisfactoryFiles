package items.resources;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class OtherResources {
	Other_Def otherTypes[];
	public OtherResources(JSONArray _other)
	{
		otherTypes = new Other_Def[_other.size()];
		for(int i = 0; i < _other.size(); i++)
		{
			JSONObject Selected = (JSONObject)_other.get(i);
			otherTypes[i] = new Other_Def((String)Selected.get("name"), (long)Selected.get("ID"), (long)Selected.get("stackSize"));
		}
	}
	
	public void printList()
	{
		for(int i = 0; i < otherTypes.length; i++)
		{
			System.out.println(otherTypes[i].toString());
		}
	}
	public class Other_Def
	{
		String otherType;
		long ID;
		long stackSize;
		public Other_Def(String _otherType, long _ID, long _stackSize) 
		{
			this.otherType = _otherType;
			this.ID = _ID;
			this.stackSize = _stackSize;
		}
		public String getFloraType() {
			return otherType;
		}
		public long getID() {
			return ID;
		}
		public long getStackSize() {
			return stackSize;
		}
		@Override
		public String toString() {
			return "Other_Def [otherType=" + otherType + ", ID=" + ID + ", stackSize=" + stackSize + "]";
		}
	}
}
