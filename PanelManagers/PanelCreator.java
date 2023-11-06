package PanelManagers;

import java.awt.Color;
import javax.swing.*;

import UIExtensions.*;

public class PanelCreator
{
    public static void CreateMainPanel()
    {
    	Panel panel = PanelController.addNewPanel("Main");
    	GroupLayout layout = new GroupLayout(panel);
    	JLabel logoLabel = new JLabel("Showtime Hub 🍿");
    	JLabel tagLineLabel = new JLabel("Your one-stop shop for movie tickets! 🎬");
    	Button bookNowButton = new Button("Start Booking Now!");

        panel.setLayout(layout);
        panel.setBounds(40,80,200,200);    
        panel.setGradient(new Color(243, 243, 243, 255), new Color(179, 179, 179, 255), 1);

        bookNowButton.setSize(200, 40);
        bookNowButton.setForeground(new Color(255, 255, 255, 255));
        bookNowButton.setBackground(new Color(25, 25, 25, 255));
        bookNowButton.setPressedBackgroundColor(new Color(55, 55, 55, 255));
        bookNowButton.addActionListener(e -> {
            System.out.println("Start Booking Button Pressed");
        });

        panel.add(logoLabel);
        panel.add(tagLineLabel);
        panel.add(bookNowButton);
    }
}