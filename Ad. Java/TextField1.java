/* 3) WAP to demonstrate AWT Text Field in Java. */

import java.awt.*;
import java.applet.*;

public class TextField1 extends Applet
{
	TextField text1, text2;

	public void init()
	{
		// Create Instances of Text Fields
		text1 = new TextField("ABC",20);
		text2 = new TextField("PQR");

		// Add Instances of Text Fields to Applet
		add(text1);
		add(text2);

		// Set Background and Foreground
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
}

/* <applet code = "TextField1" width = 500 height = 500> </applet> */