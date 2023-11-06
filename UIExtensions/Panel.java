package UIExtensions;

import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel
{
	public String name;

	private Color color1 = Color.white;
	private Color color2 = Color.white;
	private int gradientOrientation;

	public Panel(String name)
	{
		super(new BorderLayout());
		this.name = name;
	}

	public void setGradient(Color color1, Color color2, int gradientOrientation)
	{
		this.color1 = color1;
		this.color2 = color2;	
		this.gradientOrientation = gradientOrientation;
	}

	@Override
    public void setBackground(Color color) 
    {
    	color1 = color;
    	color2 = color;
    }

	@Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        if (gradientOrientation == -1) gp = new GradientPaint(0, h, color1, 0, 0, color2);
        else if (gradientOrientation == 2) gp = new GradientPaint(0, 0, color1, w, 0, color2);
        else if (gradientOrientation == -2) gp = new GradientPaint(w, 0, color1, 0, 0, color2);
        else if (gradientOrientation == 3) gp = new GradientPaint(0, 0, color1, w, h, color2);
        else if (gradientOrientation == -3) gp = new GradientPaint(w, h, color1, 0, 0, color2);
        else if (gradientOrientation == 4) gp = new GradientPaint(0, h, color1, w, 0, color2);
        else if (gradientOrientation == -4) gp = new GradientPaint(w, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
}