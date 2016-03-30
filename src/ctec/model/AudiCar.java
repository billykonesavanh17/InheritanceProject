package ctec.model;

public class AudiCar extends Car
{
	private String modelName;
	private int yearMake;
	private String brandName;
	
	public AudiCar()
	{
		this.setModelName("R8");
		this.setYearMake(2017);
		this.setBrandName("Audi");
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
