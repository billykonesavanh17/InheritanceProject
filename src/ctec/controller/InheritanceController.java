package ctec.controller;

import java.util.ArrayList;

import ctec.model.CoolThing;

public class InheritanceController
{
	
	public InheritanceController()
	{
		//build all model components
		makeCoolList();
		//build view
	}
	private ArrayList<CoolThing> coolThings;
	
	public String showCoolnessLevels()
	{
		
	}
	
	private void makeCoolList()
	{
		coolThings.add(new AudiCar());
		coolThings.add(new NisanCar());
	}

	public void start()
	{
		
	}
}
