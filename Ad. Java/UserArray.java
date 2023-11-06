/* WAP to declare an array of size 5. Accept the values of array from the user at Runtime
   and Display them */

import java.util.*;
class UserArray
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		int num, i;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n\n Enter any 5 Elements of Array A: ");
		for(i=0; i<5; i++)
		{
			System.out.print("\n\n Enter any Number: ");
			num = scan.nextInt();
			a[i] = num;
		}

		System.out.print("\n\n Displaying Elements of Array A: ");
		for(i=0; i<5; i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}
