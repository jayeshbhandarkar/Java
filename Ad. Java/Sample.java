/* WAP to demonstrate Data Input Stream class in java */

import java.io.*;
class Sample
{
	public static void main(String args[])
	{
		int a,b,sum;
		DataInputStream input = new DataInputStream(System.in);

		try
		{
			System.out.println("\n\n Enter any 2 Numbers:");
			String X = input.readLine();
			String Y = input.readLine();

			a=Integer.parseInt(X);
			b=Integer.parseInt(Y);

			sum = a+b;

			System.out.println("\n\n A = "+a);
			System.out.println("\n\n B = "+b);
			System.out.println("\n\n Sum = "+sum);
		}

		catch(Exception e)
		{
			System.out.println("\n\n Error");
		}
	}
}