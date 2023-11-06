package UIExtensions;

import javax.swing.*;
import java.util.ArrayList;

import UIExtensions.*;

public class Frame extends JFrame
{
	private ArrayList<Panel> panels = new ArrayList<Panel>(0); 

	public Frame()
	{
		setVisible(true);
		setSize(1093, 614);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("Movie Ticket System ~ PBAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon("Assets/Logo.png");
		setIconImage(icon.getImage());
	}

	public Panel addNewPanel(String name)
	{
		Panel panel = new Panel(name);
		add(panel);
		panels.ensureCapacity(panels.size() + 1);
		panels.add(panel);

		return panels.get(panels.size() - 1);
	}

	public void openPanel(String name)
	{
		for (int i = 0; i < panels.size(); i++)
		{
			Panel panel = panels.get(i);
			if (panel.name == name) panel.setVisible(true);
			else panel.setVisible(false);
		}
	}

}