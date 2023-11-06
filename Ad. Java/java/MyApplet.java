/* WAP to create an applet in java */

import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet
{
	String msg = null;

	public void init()
	{
		msg = "Welcome To Applet Programming";
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
	}
}

/*
	<Applet code = MyApplet.java width=500 height=500> </Applet>
*/