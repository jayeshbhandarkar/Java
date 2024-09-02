/* WAP to read a file and display the contents of the file on the console window by using
   File Input Stream class. */

import java.io.*;

class FileInput1
{
	public static void main(String args[])
	{
		FileInputStream fin;

		try
		{
			fin = new FileInputStream("City.txt");

			byte b[] = new byte [fin.available()];

			fin.read(b);

			for(int i=0; i<b.length; i++)
			{
				System.out.print((char)b[i]);
			}
			
			fin.close();
		}

		catch(IOException e)
		{}
	}
}