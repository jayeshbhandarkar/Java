/* WAP to find the sum of 2 Numbers, accepted from user at Runtime */

import java.io.*;
class Sum
{
	public static void main(String args[])
	{
		int a=0, b=0, sum;
		String S1, S2;

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(input);

		try
		{
			System.out.println("\n\n Enter 1st No.:");
			S1= buff.readLine();
			a = Integer.parseInt(S1);
			
			System.out.println("\n\n Enter 2nd No.:");
			S2= buff.readLine();
			b = Integer.parseInt(S2);

			sum = a+b;
			System.out.print("\n\n 1st No.= "+a);
			System.out.print("\n\n 2nd No.= "+b);
			System.out.print("\n\n Sum = "+sum);
		}

		catch(Exception e)
		{
			System.out.print("\n\n Error");
		}
	}
}

