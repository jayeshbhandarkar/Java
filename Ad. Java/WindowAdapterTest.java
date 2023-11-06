/* 9) WAP to Create a frame in Java */

import java.awt.*;
import java.awt.event.*;

public class WindowAdapterTest
{
	public static void main(String args[])
	{
		Frame F = new Frame("My Frame");

		WindowListener listener = new WindowAdapter()
		{
			// Override
			public void WindowClosing(WindowEvent e)
			{
				System.out.println("\n\n Exiting from a Frame");
				System.exit(0);
			}		
		};

		F.addWindowListener(listener);
		F.setSize(700,400);
		F.setVisible(true);
	}
}