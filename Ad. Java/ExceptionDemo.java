/* WAP to demonstrate try-catch to handle exception in java */

import java.io.*;
class ExceptionDemo
{
	public static void main(String args[])
	{
		System.out.print("\n\n Execution Begins Here \n");
		int a=0, b=20, c=0;

		// Exception Handling
		try
		{
			c = b/a; 
		}

		catch(Exception e)
		{
			System.out.print("\n\n Runtime Error");
		}

		System.out.print("\n\n C = "+c);
		System.out.print("\n\n Execution Ends Here \n\n");
	}
}