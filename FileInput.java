/* WAP to read a file and display the contents of the file on the console window by using
   File Input Stream class. */

import java.io.*;
class FileInput
{
	public static void main(String args[])
	{
		FileInputStream fin;
		int c;

		try
		{
			fin = new FileInputStream("City.txt");
			System.out.println("\n Reading file City.txt \n");

			while((c = fin.read()) != -1)
			{
				System.out.print((char)c);
			}

			fin.close();
		}

		catch(IOException e)
		{
			System.out.println("\n\n Exception");
		}
	}
}