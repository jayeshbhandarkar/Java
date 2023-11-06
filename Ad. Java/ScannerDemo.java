/* WAP to demonstrate Scanner class in Java */

import java.util.*;
class ScannerDemo
{
	public static void main(String args[])
	{
		int a, b, sum;
		Scanner scan = new Scanner(System.in);

		System.out.print("\n\n Enter any 2 Numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();

		sum = a + b;
		System.out.println("\n\n Sum = "+sum);
	}
}