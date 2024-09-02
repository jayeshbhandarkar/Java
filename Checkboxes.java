/* 20) WAP to demonstrate Constructors and Methods of Checkbox class in java. */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Checkboxes extends Applet implements ItemListener
{
	// Create checkbox
	Checkbox idea, airtel, reliance, vodafone;
	String msg = null;

	public void init()
	{
		// Instantiate checkbox
		idea = new Checkbox("Idea");
		airtel = new Checkbox("Airtel");
		reliance = new Checkbox("Reliance");
		vodafone = new Checkbox("Vodafone");

		// Add checkboxes to Applet window
		add(idea);
		add(airtel);
		add(reliance);
		add(vodafone);

		// Register checkbox into the list of listener
		idea.addItemListener(this);
		airtel.addItemListener(this);
		reliance.addItemListener(this);
		vodafone.addItemListener(this);

		// setBackground and Foreground color of checkbox
		idea.setBackground(Color.red);
		idea.setForeground(Color.yellow);

		// setBackground and Foreground color of applet window
		setBackground(Color.magenta);
		setForeground(Color.black);
	}

	// Override method of ItemListener
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}

	// Override paint()method
	public void paint(Graphics g)
	{
		msg = "Current state of Checkboxes";
		g.drawString(msg,50,100);

		msg = "Idea:"+idea.getState();
		g.drawString(msg,50,150);

		msg = "Airtel:"+airtel.getState();
		g.drawString(msg,50,200);

		msg = "Reliance:"+reliance.getState();
		g.drawString(msg,50,250);

		msg = "Vodafone:"+vodafone.getState();
		g.drawString(msg,50,300); 
	}	
}

/* <Applet code = "Checkboxes" width = 500 height = 500> </Applet> */