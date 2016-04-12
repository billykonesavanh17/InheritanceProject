package ctec.model;

import javax.swing.JOptionPane;
import ctec.controller.InheritanceController;

public class NBABasketballGame extends BasketballG
{
	public NBABasketballGame()
	{
		this.setCourtName("Oracle Arena");
		this.setBall(true);
		this.setTeamSizes(5);
		this.setTeamNames("Warriors vs. 76ers");
	}


	public NBABasketballGame(InheritanceController baseController)
	{

	}

	public double coolnessLevel()
	{
		return 20;
	}

	public void coolAction(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{
			JOptionPane.showMessageDialog(null, "GO WARRIORS WOO");
		}
	}


	public int cost()
	{
	return 1000;
	}


	public void EthanBradberry(int numberOfTimes)
	{
		for(int spot = 0; spot < numberOfTimes; spot++)
		{		
			JOptionPane.showMessageDialog(null, "IM ETHAN BRADBERRY");
		}
	}



}
