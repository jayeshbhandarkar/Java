/* 10) WAP to Create a Frame within an Applet window. 
			OR
       WAP to Create a Child Frame within an Applet. */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// Step-1 => Create a Frame

class SampleFrame extends Frame
{
	SampleFrame(String title)
	{
		// Title of Frame
		super(title);
		
		// Override By using Anonymous class method
		WindowListener sam = new WindowAdapter()
		{
			//Override method of WindowListener / WindowAdapter
			public void windowClosing(WindowEvent e)
			{
				//Terminate the Frame System.exit(0);
			}
		};

		// Add Frame to Listener List
		addWindowListener(sam);
	}

	public void paint(Graphics g)
	{
		g.drawString("This is a Frame Window",10,50);
	}
}

// Step-2 => Create an Applet and Add the Frame into it

public class FrameDemo1 extends Applet
{
	Frame f;
	public void init()
	{
		f = new SampleFrame("My Frame");
		f.setSize(300,300);
		f.setVisible(true);
	}

	public void start()
	{
		f.setVisible(true);
	}

	public void stop()
	{
		f.setVisible(false);
	}

	public void paint(Graphics g)
	{
		g.drawString("This is an Applet Window",10,50);
	}
}

/* <Applet code = FrameDemo1 width = 500 height = 500></Applet> */