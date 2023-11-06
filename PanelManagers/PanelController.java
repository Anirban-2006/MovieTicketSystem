package PanelManagers;

import javax.swing.*;
import java.util.ArrayList;

import UIExtensions.*;

public class PanelController
{
	private static JFrame _frame; // The main window
	private static ArrayList<Panel> panels = new ArrayList<Panel>(0); // All the different panels/screens

	// Setup and start the GUI window
	public static void initializeFrame()
	{
		_frame = new JFrame("Main Window");
		_frame.pack();
		_frame.setResizable(false);
		_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		_frame.setVisible(true);
		_frame.setMinimumSize(_frame.getSize());
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// Create new panel and add to the list
	public static Panel addNewPanel(String name)
	{
		Panel panel = new Panel(name);
		_frame.add(panel);
		panels.ensureCapacity(panels.size() + 1);
		panels.add(panel);

		return panels.get(panels.size() - 1);
	}

	// Loop through all panels and open the required one while closing others
	public static void openPanel(String name)
	{
		for (int i = 0; i < panels.size(); i++)
		{
			Panel panel = panels.get(i);
			if (panel.name == name) panel.setVisible(true);
			else panel.setVisible(false);
		}
	}

}