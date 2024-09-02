/* 12) WAP to demonstrate FlowLayout Manager in Java. */

import java.awt.*;
import java.awt.event.*;

class MyAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}

public class Flow extends Frame
{
	Label L1, L2;
	Flow(String title)
	{
		super(title);

		L1 = new Label("Label-1");
		L2 = new Label("Label-2");

		add(L1);
		add(L2);

		addWindowListener(new MyAdapter());
		L1.setBackground(Color.red);
		L2.setBackground(Color.red);
	}

	public static void main(String args[])
	{
		Frame F = new Flow("Flow Layout Demo");

		F.setSize(500,500);
		F.setVisible(true);

		FlowLayout flw = new FlowLayout(FlowLayout.LEFT);
		F.setLayout(flw);
	}
}