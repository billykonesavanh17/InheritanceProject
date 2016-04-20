package ctec.view;

import javax.swing.*;
import ctec.controller.InheritanceController;
import ctec.model.CoolThing;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IneritanceView extends JPanel
{
	private InheritanceController baseController;
	private JButton sortButton;
	private JTextArea textArea;
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				textArea.setText(baseController.showCoolnessLevels());
			
			}
		});
	}

}
