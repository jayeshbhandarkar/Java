/* 7) WAP to Demonstrate AWT TextArea in Java. */

import java.awt.*;
import java.applet.*;

public class TextAreaDemo extends Applet
{
	TextArea text1, text2, text3, text4;
	int vertical, horiz, both, none;

	public void init()
	{
		both = 0;
		vertical = 1;
		horiz = 2;
		none = 3;

		text1 = new TextArea("Hello World",20,30,both);
		text2 = new TextArea("Hello World",20,30,vertical);
		text3 = new TextArea("Hello World",20,30,horiz);
		text4 = new TextArea("Hello World",20,30,none);

		add(text1);
		add(text2);
		add(text3);
		add(text4);

		setBackground(Color.cyan);
		setForeground(Color.red);
	}
}

/* <applet code = TextAreaDemo width = 600 height = 600> </applet> */