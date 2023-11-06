/* 8) WAP to create a frame in Java. */

import java.awt.*;
import java.awt.event.*;

class MyAdapter extends WindowAdapter
{
	public void windowClosing(Window Evente)
	{
		System.out.println("\n\n Exiting from a frame");
		System.exit(0);
	}
}

public class WindowAdapterTest1
{
	public static void main(String args[])
	{
		Frame F = new Frame("My Frame");
		WindowListener listener = new MyAdapter();

		// Add Frame to listeners list
		F.addWindowListener(listener);

		// set Size of Frame
		F.setSize(700,400);

		// set Frame visible
		F.setVisible(true);

	        F.setTitle("New Frame");
	}
}