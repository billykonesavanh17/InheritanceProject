package ctec.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AudiCar extends Car 
{
	private String modelName;
	private int yearMake;
	private String brandName;
	
	public AudiCar()
	{
		super();
		
		this.setModelName("R8");
		this.setYearMake(2017);
		this.setBrandName("Audi");
	}

	public double coolnessLevel()
	{
		return 9001;
	}
	
	public void coolAction(int numberOfTimes)
	{
		
	}
	
	public int cost()
	{
		return 162900;
	}
	
	public void EthanBradberry(int numberOfTimes)
	{
		
	}
}
