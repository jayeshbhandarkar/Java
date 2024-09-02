/* 17) WAP to demonstrate Menu and Menubar in Java. */

import java.awt.*;
import java.awt.event.*;

class MyMenuFrame extends Frame
{
	String msg = null;
	MyMenuFrame(String title)
	{
		super(title);
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);

		//1.Create Menu-File
		Menu file = new Menu("File");

		// Create Menu Items
		MenuItem item1, item2, item3, item4, item5;

		// Add the menu items to Menu
		file.add(item1 = new MenuItem("New"));
		file.add(item2 = new MenuItem("Open"));
		file.add(item3 = new MenuItem("Save"));
		file.add(item4 = new MenuItem("-"));
		file.add(item5 = new MenuItem("Exit"));

		// Add Menu "file" to MenuBar
		mbar.add(file);

		//2.Create Menu Items
		Menu edit = new Menu("Edit");

		// Create Menu Items
		MenuItem item6, item7, item8, item9;

		// Add the menu items to Edit Menu
		// Menu Shortcut srcut = new MenuShortcut(MenuShortcut.CTRL);

		edit.add(item6 = new MenuItem("Find"));
		edit.add(item7 = new MenuItem("Replace"));
		edit.add(item8 = new MenuItem("ZoomIn"));
		edit.add(item9 = new MenuItem("-"));

		//2.1 Create Sub Menu-Zoom
		Menu zoom = new Menu("Zoom");
		MenuItem item10, item11, item12;

		zoom.add(item10 = new MenuItem("50%"));
		zoom.add(item11 = new MenuItem("100%"));
		zoom.add(item12 = new MenuItem("200%"));

		// Add Sub-Menu "Zoom" to "Edit" menu
		edit.add(zoom);

		// Add Menu-edit to MenuBar
		mbar.add(edit);

		//3. Create Menu-Debugging
		Menu debugging = new Menu("Debugging");

		// Create checkbox Menu Items
		CheckboxMenuItem debug = new CheckboxMenuItem("Debug",false);

		// Create a MenuItem
		MenuItem test = new MenuItem("Undo");

		// Add the menu items to Menu "Debugging"
		debugging.add(debug);
		debugging.add(test);

		// Add Menu-Debugging
		mbar.add(debugging);
	}

	public static void main(String args[])
	{
		MyMenuFrame my = new MyMenuFrame("Hello");
		my.setVisible(true);
		my.setSize(500,500);
	}
}