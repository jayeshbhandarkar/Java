/* 22) WAP to demonstrate constructors and methods of TextFields class in Java Awt. */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TextFieldDemo extends Applet implements ActionListener
{
	TextField txtname, txtpass;
	Label lblname, lblpass;

	public void init()
	{
		lblname = new Label("UserName :",Label.CENTER);
		lblpass = new Label("Password :",Label.CENTER);

		txtname = new TextField(20);
		txtpass = new TextField(20);
		txtpass.setEchoChar('*');

		add(lblname);
		add(lblpass);
		add(txtname);
		add(txtpass);

		txtname.addActionListener(this);
		txtpass.addActionListener(this);

		setBackground(Color.cyan);
	}

	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("UserName :"+txtname.getText(),10,50);
		g.drawString("Selected Text :"+txtname.getSelectedText(),10,80);
		g.drawString("Password :"+txtpass.getText(),10,110);

		System.out.println("\n\n Chars:"+txtname.getColumns());
	}
}

/* <Applet code = TextFieldDemo width = 600 height = 600> </Applet> */