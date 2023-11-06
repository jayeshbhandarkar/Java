/* 4) WAP to demonstrate AWT checkbox in Java. */

import java.awt.*;
import java.applet.*;

public class Checkbox1 extends Applet
{
	Checkbox check1, check2;

	public void init()
	{
		// Create Instances of Checkbox
		check1 = new Checkbox ("C Lang");
		check2 = new Checkbox ("Java");

		// Add Instances of Text Fields to Applet
		add (check1);
		add (check2);

		// set Background and Foreground
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
}

/* <applet code = "Checkbox1" width = 500 height = 500></applet> */