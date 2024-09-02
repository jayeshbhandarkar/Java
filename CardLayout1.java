/* 15) WAP to demonstrate Card Layout Manager in java AWT. */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CardLayout1 extends Applet implements ActionListener
{
	CardLayout card;
	Button b1, b2, b3, b4;

	public void init()
	{
		// Instantiate
		card = new CardLayout(100,100);

		// Layout of Applet
		setLayout(card);

		// Instantiate Buttons
		b1 = new Button("C Programming");
		b2 = new Button("C++ Programming");
		b3 = new Button("Java Programming");
		b4 = new Button("Python Programming");

		// Add Buttons
		add(b1);
		add(b2);
		add(b3);
		add(b4);

		// Add Components to the Listener
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		card.next(this);
	}
}

/* <Applet code = "CardLayout1" width = 500 height = 500> </Applet> */