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
		sortButton = new JButton("Sort");
		
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		textPane = new JScrollPane(textArea);
		textPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		textPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEnabled(false);
		textArea.setEditable(false);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(sortButton);
		this.add(textPane);
		textArea = new JTextArea(10, 15);
		add(textArea);
		
		textArea.setEnabled(false);
		textArea.setText(baseController.showCoolnessLevels());
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textArea, 215, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sortButton, -186, SpringLayout.EAST, this);
	}
	
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
