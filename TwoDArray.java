/* WAP to demonstrate 2D Array in Java */

import java.util.*;
class TwoDArray
{
	public static void main(String args[])
	{
		int a[][] = new int [2][2];
		int num, i, j;
		
		Scanner Scan = new Scanner(System.in);

		System.out.print("\n\n Enter any 5 Elements of Array A:");

		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				System.out.print("\n\n Enter any Number:");
				num = Scan.nextInt();
				a[i][j] = num;
			}
		}

		System.out.print("\n\n Displaying Elements of Array A:");

		for(i=0; i<2; i++)
		{
			for(j=0; j<2; j++)
			{
				System.out.print(" "+a[i][j]);
			}
		}
	}
}