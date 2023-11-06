/* WAP to create an output stream which will enable us to write to the file. */

import java.io.*;

class FileOutStreamDemo
{
	public static void main(String args[])
	{
		FileOutputStream fout;

		byte b[] = {'D','e','l','h','i',' ','P','u','n','e'};

		try
		{
			fout = new FileOutputStream("City.txt");

			fout.write(b);

			System.out.println("\n\n File is Created Successfully");

			fout.close();
		}	

		catch(IOException e)
		{
			System.out.println("\n\n Error");
		}
	}
}