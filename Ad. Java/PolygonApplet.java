/* WAP to draw a Triangle on an Applet window. */

import java.awt.*;
import java.applet.*;

public class PolygonApplet extends Applet
{
	int x[] = {100,400,250,100};
	int y[] = {400,400,100,400};

	public void paint(Graphics g)
	{
		g.drawPolygon(x,y,4);
	}
}

/* 
	<Applet code = PolygonApplet width = 500 height = 500> </Applet>
*/