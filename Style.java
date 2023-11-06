import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;

import UIExtensions.*;

public class Style
{
    public static Frame window;

    public static void CreateMainPanel()
    {
    	Panel panel = window.addNewPanel("Main");
    	GroupLayout layout = new GroupLayout(panel);
        Border panelBorder = BorderFactory.createLineBorder(new Color(0xff7a7a), 3);
        Border buttonBorder = BorderFactory.createLineBorder(new Color(0xb55757), 2);
    	JLabel logoLabel = new JLabel();
    	JLabel tagLineLabel = new JLabel();
    	Button bookNowButton = new Button("Start Booking Now!");

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        panel.setLayout(layout);  
        panel.setBorder(panelBorder);
        panel.setGradient(new Color(0x151d21), new Color(0x302f2f), 55);

        logoLabel.setText("Showtime Hub 🍿");
        logoLabel.setForeground(new Color(0xffffff));

        tagLineLabel.setText("Your one-stop shop for movie tickets! 🎬");

        bookNowButton.setSize(200, 40);
        bookNowButton.setBorder(buttonBorder);
        bookNowButton.setForeground(new Color(0x252525));
        bookNowButton.setBackground(new Color(0xff7a7a));
        bookNowButton.setPressedBackgroundColor(new Color(0xb55757));
        bookNowButton.addActionListener(e -> {
            System.out.println("Start Booking Button Pressed");
        });

        panel.add(logoLabel);
        panel.add(tagLineLabel);
        panel.add(bookNowButton);
    }
}