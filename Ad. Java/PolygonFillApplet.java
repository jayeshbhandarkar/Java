/* WAP to draw an fill Triangle on an Applet window. */

import java.awt.*;
import java.applet.*;

public class PolygonFillApplet extends Applet
{
	int x[] = {100,400,250,100};
	int y[] = {400,400,100,400};

	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillPolygon(x,y,4);
	}
}

/* 
	<Applet code = PolygonFillApplet width = 500 height = 500> </Applet>
*/