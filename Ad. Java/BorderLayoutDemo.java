/* 13) WAP to demonstrate Border Layout Manager. */

import java.awt.*;
import java.applet.*;

public class BorderLayoutDemo extends Applet
{
	Button b1, b2, b3, b4;
	TextArea txtMsg;
	String msg = "Ad. Java is a GUI Programming";

	public void init()
	{
		setLayout(new BorderLayout());
		b1 = new Button("North Region");
		b2 = new Button("South Region");
		b3 = new Button("East Region");
		b4 = new Button("West Region");

		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);

		txtMsg = new TextArea(msg);

		add(txtMsg, BorderLayout.CENTER);
	}
}

/* <Applet code = "BorderLayoutDemo" width = 600 height = 600> </Applet> */