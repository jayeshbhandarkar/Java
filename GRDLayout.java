/* 14) WAP to demonstrate Grid Layout Manager in java AWT. */

import java.awt.*;
import java.applet.*;

public class GRDLayout extends Applet
{
	int n = 0;
	
	public void init()
	{
		GridLayout grid = new GridLayout(5,5,10,10);
		setLayout(grid);

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				add(new Button(" "+n));
			}
		}
	}
}

/* <Applet code = "GRDLayout" width = 600 height = 600> </Applet> */