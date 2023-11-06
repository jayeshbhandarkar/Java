/* 1) WAP to Demonstrate AWT Botton in Java . */

import java.awt.*;
import java.applet.*;

public class Buttons1 extends Applet
{
	Button b1, b2, b3;

	public void init()
	{
		// Create Instances of Buttons
		b1 = new Button ("Add");
		b2 = new Button ("Modify");
		b3 = new Button ("Delete");

		// Add Instances of Buttons to Applet
		add (b1);
		add (b2);
		add (b3);

		// Set Background and Foreground
		setBackground(Color.cyan);
		setForeground(Color.red);		
	}
}

/* <applet code = "Buttons1" width = 500 height = 500> </applet> */