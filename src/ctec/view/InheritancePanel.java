package ctec.view;

import javax.swing.*;

import ctec.controller.InheritanceController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InheritancePanel extends JPanel
{
	private InheritanceController baseController;
	private JButton sortButton;
	private JTextArea textArea;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	
	public InheritancePanel(InheritanceController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
	}

}
