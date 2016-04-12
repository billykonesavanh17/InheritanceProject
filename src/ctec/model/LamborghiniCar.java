package ctec.model;

import javax.swing.JOptionPane;

public class LamborghiniCar extends Car 
{
	private String modelName;
	private int yearMake;
	private String brandName;
	
	public LamborghiniCar()
	{
		super();
		
		this.setModelName("Gallardo");
		this.setYearMake(2014);
		this.setBrandName("Lamborghini");
	}

	public double coolnessLevel()
	{
		return  8999.99;
	}
	
	public void coolAction(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
			JOptionPane.showMessageDialog(null, "This car is cool." );
		}
	}
	
	public int cost()
	{
		return 223000;
	}
	
	public void EthanBradberry(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
			JOptionPane.showMessageDialog(null, "I'm Ethan Bradberry!!!!!!!");
		}
	}
}

