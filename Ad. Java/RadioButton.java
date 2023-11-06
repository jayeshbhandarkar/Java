/* 5) WAP to demonstrate AWT Radio Buttons / Checkbox Group in java. */

import java.awt.*;
import java.applet.*;

public class RadioButton extends Applet
{
	Checkbox check1, check2, check3, check4, check5, check6;
	CheckboxGroup gp1, gp2;

	public void init()
	{
		// Create Instance of checkbox group
		gp1 = new CheckboxGroup();
		gp2 = new CheckboxGroup();

		// Create Instances of checkbox
		check1 = new Checkbox("C Lang",gp1,false);
		check2 = new Checkbox("C++",gp1,false);
		check3 = new Checkbox("Java",gp1,true);
		check4 = new Checkbox("Python",gp1,false);
		check5 = new Checkbox("Computer",gp2,false);
		check6 = new Checkbox("IT",gp2,false);

		// Add the checkboxes to the Applet
		add (check1);
		add (check2);
		add (check3);
		add (check4);
		add (check5);
		add (check6);

		// Set Background and Foreground
		setBackground(Color.cyan);
		setForeground(Color.yellow);
	}
}

/* <applet code = "RadioButton" width = 500 height = 500> </applet> */