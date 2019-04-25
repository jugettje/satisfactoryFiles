package MainFactory;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import display.base.FactoryCalculatorFrame;
import items.components.DevelopmentStage;
import items.components.EstablishingStage;
import items.components.ExpansionStage;
import items.ResourceHandler;

import javax.swing.*;

public class MainFactory 
{

	public static ResourceHandler resources;
	public static void main(String[] args) 
	{
		FactoryCalculatorFrame window = new FactoryCalculatorFrame();
		ClassLoader classLoader = new MainFactory().getClass().getClassLoader();
		String fileName = "MainFactory/ItemProperties.json";
		File file = new File(classLoader.getResource(fileName).getFile());
		String IconName = "MainFactory/SatisfactoryLogo.png";
		ImageIcon img = new ImageIcon(classLoader.getResource(IconName).getFile());
		window.setIconImage(img.getImage());
		
		
		JSONParser parser = new JSONParser();
		try
		{
			FileReader reader = new FileReader(file.getAbsolutePath());
			Object obj = parser.parse(reader);
			JSONObject jsonObj = (JSONObject) obj;
			JSONObject Resources = (JSONObject)jsonObj.get("Resources");
			
			resources = new ResourceHandler(Resources);
			resources.printLists();
			resources.testfunc();
			
			JSONObject Components = (JSONObject)jsonObj.get("Components");
			JSONArray establishingStage = (JSONArray)Components.get("Establishing Stage");
			EstablishingStage establishingList = new EstablishingStage(establishingStage);
			establishingList.printList();
			
			JSONArray developmentStage = (JSONArray)Components.get("Development Stage");
			DevelopmentStage developmentList = new DevelopmentStage(developmentStage);
			developmentList.printList();
			
			JSONArray expansionStage = (JSONArray)Components.get("Expansion Stage");
			ExpansionStage expansionList = new ExpansionStage(expansionStage);
			expansionList.printList();
			
			window.getCenterInfoTabs().getOreInfoTab(0).displayOreList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

