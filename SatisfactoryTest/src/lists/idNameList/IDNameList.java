package lists.idNameList;

import java.util.Vector;

public class IDNameList {
	Vector<IDName_Def> IDList;
	public IDNameList()
	{
		IDList = new Vector<IDName_Def>();
	}
	
	public void addElement(IDName_Def _inputElement)
	{
		if(_inputElement != null) 
		{
			IDList.add(_inputElement);			
		}
	}
	
	public void addElements(IDName_Def[] _inputArr)
	{
		for(int i = 0; i < _inputArr.length; i++)
		{
			IDList.add(_inputArr[i]);
		}
	}
	
	public String findNameByID(long _ID)
	{
		for(IDName_Def selected : IDList)
		{
			if(selected.equals(_ID))
			{
				return selected.getName();
			}
		}
		System.out.println("ID not found");
		return null;
	}
	
	public long findIDByName(String _name)
	{
		for(IDName_Def selected : IDList)
		{
			if(selected.equals(_name)) 
			{
				return selected.getID();
			}
		}
		System.out.println("name not found");
		return 0;
	}

	public void printIdList()
	{
		for(IDName_Def selected : IDList)
		{
			System.out.println(selected.toString());
		}
	}

}
