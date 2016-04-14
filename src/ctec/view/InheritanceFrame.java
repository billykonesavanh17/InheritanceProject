package ctec.view;

import javax.swing.JFrame;

import ctec.controller.InheritanceController;

public class InheritanceFrame extends JFrame
{
	private InheritanceController baseController;
	private InheritancePanel basePanel;
	
	public InheritanceFrame(InheritanceController baseController)
	{
		this.baseController = baseController;
		basePanel = new InheritancePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(575,400);
		this.setTitle("Inheritance");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public InheritanceController getBaseController()
	{
		return baseController;
	}

}
