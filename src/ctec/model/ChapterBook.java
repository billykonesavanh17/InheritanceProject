package ctec.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;



public class ChapterBook extends Book

{

private String bookName;

private String mainCharacter;

private int yearWritten;


public ChapterBook()

{

this.setBookName("The Hunger Games");

this.setMainCharacter("Katniss");

this.setYearWritten(2008);

}



public double coolnessLevel()

{

return 5;

}



public void coolAction(int numberOfTimes)

{

for(int spot = 0; spot < numberOfTimes; spot++)

{

JOptionPane.showMessageDialog(null, "This is cool!");

}

}



public int cost()

{


return 15;

}



public void EthanBradberry(int numberOfTimes)

{

for(int spot = 0; spot < numberOfTimes; spot++)

{

JOptionPane.showMessageDialog(null, "I'm Ethan Bradberry!");

}

}

public int compareTo(Object compared)
{
	int comparedValue = Integer.MIN_VALUE;
	
	if(compared instanceof CoolThing)
	{
		if(this.coolnessLevel() > ((CoolThing) compared).coolnessLevel())
		{
			comparedValue = 1;
		}
		else if(this.coolnessLevel() < ((CoolThing) compared).coolnessLevel())
		{
			comparedValue = -1;
		}
		else
		{
			comparedValue = 0;
		}
	}
	
	return comparedValue;
}

}


