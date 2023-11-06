/* WAP to accept 2 input Strings using <Param> tag and concatenate the Strings and display
   it in the Status window of an Applet. */

import java.awt.*;
import java.applet.*;

public class StatusDemo extends Applet
{
	String Str1 = null, Str2 = null, msg = null;
	
	public void init()
	{
		Str1 = getParameter("S1");
		Str2 = getParameter("S2");
		msg = Str1 + Str2 ;
	}

	public void paint(Graphics g)
	{
		showStatus(msg);
	}
}

/*
	<Applet code = "StatusDemo.java" width = 500 height = 500>
	    <Param name="S1" value="Hello">
	    <Param name="S2" value="Jayesh">
	</Applet>
*/