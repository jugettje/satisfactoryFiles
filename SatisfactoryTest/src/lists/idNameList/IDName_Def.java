package lists.idNameList;

public class IDName_Def
{
	String name;
	long ID;
	public IDName_Def(String _name, long _ID)
	{
		this.name = _name;
		this.ID = _ID;
	}
	public boolean equals(long _inputID)
	{
		if(_inputID == this.ID)
		{
			return true;
		}
		return false;
	}
	public boolean equals(String _inputName)
	{
		if(_inputName.contentEquals(this.name))
		{
			return true;
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public long getID() {
		return ID;
	}
	@Override
	public String toString() {
		return "IDName_Def [name=" + name + ", ID=" + ID + "]";
	}
}