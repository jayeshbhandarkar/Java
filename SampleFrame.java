/* 11) WAP to show the current position i.e. X and Y co-ordinates of the mouse pointer on
       a window. (Application - MouseTracker) */

import java.awt.*;
import java.awt.event.*;

// Create Frame
class SampleFrame extends Frame
{
	String mousemsg = " ";
	int mouseX = 0, mouseY = 0;

	// Default Constructor
	SampleFrame()
	{
		// Add Frame to WindowListener List
		addWindowListener(new MyWindowAdapter());

		// Add Mouse to MouseMotionListener list
		addMouseMotionListener(new MyMouseAdapter(this));
	}

	public void paint(Graphics g)
	{
		g.drawString("This is a Frame Window",10,50);
		g.drawString(mousemsg,10,200);
	}

	public static void main(String args[])
	{
		SampleFrame f = new SampleFrame();

		f.setSize(500,500);
		f.setVisible(true);
		f.setTitle("Mouse Tracker");
	}
}

// For Closing the Frame
class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

// For getting X and Y co-ordinate of mouse
class MyMouseAdapter extends MouseMotionAdapter
{
	SampleFrame f1;

	// Instanstiate the f1 by current instance of Frame
	public MyMouseAdapter(SampleFrame f2)
	{
		f1 = f2;
	}

	public void mouseMoved(MouseEvent e)
	{
		f1.mouseX = e.getX(); // Gets X-coordinate of Mouse
		f1.mouseY = e.getY(); // Gets Y-coordinate of Mouse

		f1.mousemsg = "Mouse Current Position :" +f1.mouseX +" "+f1.mouseY;
		f1.repaint();
	}
}	