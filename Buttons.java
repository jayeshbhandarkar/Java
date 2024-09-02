/* 19) WAP to demonstrate Buttons and get Action Command() in Java AWT. */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Buttons extends Applet implements ActionListener
{
	Button b1, b2, b3;
	String msg = null, Str1 = null, Str2 = null, Str3 = null;

	public void init()
	{
		// Create Instances of Buttons
		b1 = new Button("Add");
		b2 = new Button("Modify");
		b3 = new Button("Delete");

		// Add Instances of Buttons to Applet
		add(b1);
		add(b2);
		add(b3);

		// Register Buttons to Listeners
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		// Get Labels of Buttons
		Str1 = b1.getLabel();
		Str2 = b2.getLabel();
		Str3 = b3.getLabel();

		System.out.println("\n\n Button1: "+Str1);
		System.out.println("\n\n Button2: "+Str2);
		System.out.println("\n\n Button3: "+Str3);

		// Set Background and Foreground
		setBackground(Color.cyan);
		setForeground(Color.red);
	}

	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();	// Gets Label of Button Press
		
		if(str.equals("Add"))
		{
			msg = "You pressed Add Buttons";
		}

		else if(str.equals("Modify"))
		{
			msg = "You pressed Modify Buttons";
		}

		else if(str.equals("Delete"))
		{
			msg = "You pressed Delete Buttons";
		}

		else
		{
			msg = "Error";
		}

		repaint();	// refresh the applet window
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,50,100);
	}
}

/* <Applet code = "Buttons" width = 500 height = 500> </Applet> */