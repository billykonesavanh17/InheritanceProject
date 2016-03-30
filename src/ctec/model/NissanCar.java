package ctec.model;

public class NissanCar extends Car
{
	private String modelName;
	private int yearMake;
	private String brandName;
	
	public NissanCar()
	{
		this.setModelName("Skyline R34 GT-R");
		this.setYearMake(2002);
		this.setBrandName("Nisan");
	}

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
	
	
}
