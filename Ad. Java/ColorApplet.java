/* WAP to Set background color with red and foreground color with blue */

import java.awt.*;
import java.applet.*;

public class ColorApplet extends Applet
{
	String str = null;

	public void init()
	{
		str = "Welcome To Applet Programming";
		setBackground(Color.black);
		setForeground(Color.yellow);
	}

	public void paint(Graphics g)
	{
		g.drawString(str,100,100);
	}
}

/*
	<applet code = "ColorApplet.java" width=500 height=500> </applet>
*/