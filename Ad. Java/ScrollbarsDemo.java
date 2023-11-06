/* 6) WAP to demonstrate AWT Scrollbars in Java. */

import java.awt.*;
import java.applet.*;

public class ScrollbarsDemo extends Applet
{
	Scrollbar vsb, hsb;
	int vertical, horiz;

	public void init()
	{
		vertical = Scrollbar.VERTICAL;	//1
		horiz = Scrollbar.HORIZONTAL; 	//0

		vsb = new Scrollbar(vertical,40,40,0,100);
		hsb = new Scrollbar(horiz,40,40,0,100);

		add(vsb);
		add(hsb);

		setBackground(Color.cyan);
		setForeground(Color.red);
	}
}

/* <applet code = ScrollbarsDemo width = 600 height =600></applet> */