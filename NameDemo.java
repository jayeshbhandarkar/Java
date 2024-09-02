/* WAP to accept users name in the form of parameter of an Applet and print a msg as 
   " Hello Username ". */

import java.awt.*;
import java.applet.*;

public class NameDemo extends Applet
{
	String str = null;

	public void init()
	{
		str = getParameter("UserName");
		setBackground(Color.cyan);
		setForeground(Color.red);
	}

	public void paint(Graphics g)
	{
		g.drawString("Hello "+str,100,100);
	}
}

/*
	<Applet code = "NameDemo.java" width = 500 height = 500>
		<Param name = "UserName" value = "Jayesh">
	</Applet>
*/