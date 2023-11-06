/* 18) WAP to Demonstrate File Dialog in Java AWT. */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// Create Frame as a Parent
class FileDialogDemo3 extends Frame implements ActionListener
{
	Button b;
	FileDialog FD;

	FileDialogDemo3(String title)
	{
		// For Frame
		super(title);

		setSize(600,600);
		setVisible(true);

		// Remove Layout Manager
		setLayout(null);

		// For Button
		b = new Button("Open");
		b.setLocation(100,100);
		b.setSize(100,100);

		// Add Button to Frame
		add(b);

		// Add Button to Listener List
		b.addActionListener(this);

		// Frame Close
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);	// Terminate the current Window
			}
		});

		// File Dialog
		FD = new FileDialog(this,"MyFileDialog");
		FD.setSize(200,200);
	}

	// Override to Perform some operation when user clicks Button
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("\n\n Button Clicked");
		FD.setVisible(true);
	}

	// main 
	public static void main(String args[])
	{
		// File Dialog Demo
		FileDialogDemo3 MyFrame = new FileDialogDemo3("MyFile");
	}
}