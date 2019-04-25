package items;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import items.resources.FloraAndFauna;
import items.resources.HealingItems;
import items.resources.Ores;
import items.resources.OtherResources;
import lists.idNameList.IDNameList;

public class ResourceHandler {
	Ores oreList;
	FloraAndFauna floraList;
	HealingItems HealingList;
	OtherResources otherList;
	IDNameList IDList;
	
	public ResourceHandler(JSONObject _Resources)
	{
		IDList = new IDNameList();
		
		JSONArray ores = (JSONArray)_Resources.get("Ores");
		JSONArray floraAndFauna = (JSONArray)_Resources.get("Flora And Fauna");
		JSONArray healingItems = (JSONArray)_Resources.get("Healing Items");
		JSONArray otherResources = (JSONArray)_Resources.get("Other Resources");
		
		oreList = new Ores(ores);
		floraList = new FloraAndFauna(floraAndFauna);
		HealingList = new HealingItems(healingItems);
		otherList = new OtherResources(otherResources);
		generateIDList();
		
	}
	public Ores getOreList() {
		return oreList;
	}
	public FloraAndFauna getFloraList() {
		return floraList;
	}
	public HealingItems getHealingList() {
		return HealingList;
	}
	public OtherResources getOtherList() {
		return otherList;
	}
	public IDNameList getIDList() {
		return IDList;
	}
	public void printLists()
	{
		oreList.printList();
		floraList.printList();
		HealingList.printList();
		otherList.printList();
		IDList.printIdList();
	}
	public void testfunc()
	{
		System.out.println(IDList.findNameByID(1));
		System.out.println(IDList.findIDByName("Raw Quartz"));
	}
	private void generateIDList()
	{
		IDList.addElements(oreList.generateIDElements());
		//IDList.printIdList();
		//System.out.println(IDList.findNameByID(1));
	}
}
