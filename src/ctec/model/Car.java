package ctec.model;


/**
 * Implements the CoolThingand Comparable interface.
 * @author Billy Konesavanh
 * @version 1.5
 */
public abstract class Car implements CoolThing, Comparable
{
	//Three Data Members
	private String modelName;
	private int yearMake; 
	private String brandName;
	
	
	public String getModelName()
	{
		return modelName;
	}
	public void setModelName(String modelName)
	{
		this.modelName = modelName;
	}
	public int getYearMake()
	{
		return yearMake;
	}
	public void setYearMake(int yearMake)
	{
		this.yearMake = yearMake;
	}
	public String getBrandName()
	{
		return brandName;
	}
	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}
	
	public String toString()
	{
		String description = "This is a " + this.getClass().getName() + " and has a cost of " + cost();
		
		return description;
	}
	
	/**
	 * If the supplied variable compared comes before the calling variable return 1.
	 * If the supplied variable is after the calling variable return -1.
	 * Else if the are the same, return 0.
	 */
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
