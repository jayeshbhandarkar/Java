/* 16) WAP to demonstrate Grid Bag Layout Manager in java AWT. */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class GridBagEX2 extends Applet
{
	// Methods to create Buttons 
	protected void makebutton(String name, GridBagLayout gridbag, GridBagConstraints C)
	{
		Button button = new Button(name);
		gridbag.setConstraints(button,C);
		add(button);
	}

	// Override methods of Applet class 
	public void init()
	{
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints C = new GridBagConstraints();
		
		setFont(new Font("Sansserif",Font.PLAIN,14));
		setLayout(gridbag);

		C.fill = GridBagConstraints.BOTH;
		C.weightx = 1.0;

		makebutton("Button1",gridbag,C);
		makebutton("Button2",gridbag,C);
		makebutton("Button3",gridbag,C);

		// end row
		C.gridwidth = GridBagConstraints.REMAINDER;
		makebutton("Button4",gridbag,C);

		// reset to the default
		C.weightx = 0.0;
		makebutton("Button5",gridbag,C);	// another row

		// next-to-last in row
		C.gridwidth = GridBagConstraints.RELATIVE;
		makebutton("Button6",gridbag,C);

		// end row
		C.gridwidth = GridBagConstraints.REMAINDER;
		makebutton("Button7",gridbag,C);

		// reset to the default
		C.gridwidth = 1;		// width of the display area is 1 (Column)
		C.gridheight = 2;		// height of the display area is 2 (rows)
		C.weighty = 1.0;
		makebutton("Button8",gridbag,C);

		// reset to the default
		C.weighty = 0.0;

		// end of the row
		C.gridwidth = GridBagConstraints.REMAINDER;

		// reset to the default
		C.gridwidth = 1;
		makebutton("Button9",gridbag,C);
		makebutton("Button10",gridbag,C);
	}
}

/* <Applet code = "GridBagEX2" width = 500 height = 500> </Applet> */