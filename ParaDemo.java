/* WAP to demonstrate passing parameter to an Applet using <param> tag */

import java.awt.*;
import java.applet.*;

public class ParaDemo extends Applet
{
	String str;
	
	public void init()
	{
		str = getParameter("msg");
		setBackground(Color.cyan);
		setForeground(Color.red);
	}

	public void paint(Graphics g)
	{
		g.drawString(str,100,100);
	}
}

/*
	<Applet code = "ParaDemo.java" width = 500 height = 500>
		<Param name = "msg" value = "Welcome to Applet Programming">
	</Applet>
*/