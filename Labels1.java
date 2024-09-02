/* 2) WAP to demonstrate AWT Label in Java. */

import java.awt.*;
import java.applet.*;

public class Labels1 extends Applet
{
	Label lab1, lab2, lab3;

	public void init()
	{
		// Create Instances of Labels
		lab1 = new Label ("LABEL1",Label.CENTER);
		lab2 = new Label ("LABEL2",Label.CENTER);
		lab3 = new Label ("LABEL3",Label.CENTER);

		// Add Instances of Labels to Applet
		add (lab1);
		add (lab2);
		add (lab3);

		// Set Background and Foreground
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
}

/* <applet code = "Labels1" width = 500 height = 500> </applet> */