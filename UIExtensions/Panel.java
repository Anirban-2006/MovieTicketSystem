package UIExtensions;

import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel
{
	public String name;

	private Color color1 = Color.white;
	private Color color2 = Color.white;
	private int gradientAngle;

	public Panel(String name)
	{
		super(new BorderLayout());
		this.name = name;
	}

	public void setGradient(Color color1, Color color2, int gradientAngle)
	{
		this.color1 = color1;
		this.color2 = color2;	
		this.gradientAngle = gradientAngle;
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

        int offset;
        if (gradientAngle > 0 && gradientAngle <= 45)
        {
        	offset = (int)(Math.tan(Math.toRadians(gradientAngle)) * h);
        	gp = new GradientPaint(0, h, color1, offset, 0, color2);
        }
        if (gradientAngle > 45 && gradientAngle <= 90)
        {
        	offset = (int)(Math.tan(Math.toRadians(90 - gradientAngle)) * w);
        	gp = new GradientPaint(0, h, color1, w, h - offset, color2);
        }
		if (gradientAngle < 0 && gradientAngle >= -45)
        {
        	offset = (int)(Math.tan(Math.toRadians(gradientAngle)) * h);
        	gp = new GradientPaint(w, h, color1, w + offset, 0, color2);
        }
        if (gradientAngle < 45 && gradientAngle >= -90)
        {
        	gradientAngle = -gradientAngle;
        	offset = (int)(Math.tan(Math.toRadians(90 - gradientAngle)) * w);
        	gp = new GradientPaint(w, h, color1, 0, h - offset, color2);
        }

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
}