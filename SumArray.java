/* WAP to create an Array of Size 5. Accept and display the elements of array. Also 
   calculate sum of Array elements */

import java.util.*;
class SumArray
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		int num, i, sum=0, length;

		Scanner Scan = new Scanner(System.in);

		System.out.print("\n\n Enter any 5 Elements of Array A:");

		for(i=0; i<5; i++)
		{
			System.out.print("\n\n Enter any Number:");
			num = Scan.nextInt();
			a[i] = num;
		}

		System.out.print("\n\n Displaying Elements of Array A:");

		for(i=0; i<5; i++)
		{
			System.out.print(" "+a[i]);
		}

		for(i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}

		System.out.print("\n\n Sum of Array Elements: "+sum);
	}
}