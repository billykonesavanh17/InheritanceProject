package ctec.controller;

import java.util.ArrayList;

import ctec.model.CoolThing;
import ctec.model.AudiCar;
import ctec.model.NissanCar;
import ctec.model.LamborghiniCar;
import ctec.model.ChapterBook;
import ctec.model.Basketball;
import ctec.model.NBABasketballGame;
import ctec.view.InheritanceFrame;

public class InheritanceController
{
	private InheritanceFrame baseFrame;
	
	public InheritanceController()
	{
		//build all model components
		this.coolThings = new ArrayList<CoolThing>();
		makeCoolList();
		baseFrame = new InheritanceFrame(this);
		//build view
	}
	private ArrayList<CoolThing> coolThings;
	
	public String showCoolnessLevels()
	{
		String cool = "";
		for(CoolThing currentCool : coolThings)
		{
			cool.concat("This is a " + currentCool.toString() + " and has a coolness level of " + currentCool.coolnessLevel() + "\n");
		}
		
		return cool; 
	}
	
	private void makeCoolList()
	{
		coolThings.add(new AudiCar());
		coolThings.add(new NissanCar());
		coolThings.add(new LamborghiniCar());
		coolThings.add(new ChapterBook());
		coolThings.add(new Basketball());
		coolThings.add(new NBABasketballGame());
	}

	public void start()
	{
	
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		CoolThing temp = coolThings.get(firstLocation);
		coolThings.set(firstLocation, coolThings.get(secondLocation));
		coolThings.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < coolThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (coolThings.get(innerLoop - 1).compareTo(coolThings.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop - 1);
				innerLoop --;
			}
		}
	}
	
	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quicksort(low, midPoint - 1);
			quicksort(midPoint + 1, high);
		}
	}
	
	private int partition(int low, int high)
	{
		int position = low;
		CoolThing pivot = coolThings.get(high);
		for(int spot = low; spot < high - 1; spot++)
		{
			if(coolThings.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position ++;
			}
		}
		swap(position, high);
		
		return position;
	}
}
