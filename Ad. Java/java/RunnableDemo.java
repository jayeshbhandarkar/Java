/* WAP to find whether the entered no. is even or odd by implementing Runnable Interface */

import java.util.Scanner;

class EvenOdd implements Runnable
{
	int num;
	Scanner Scan = new Scanner(System.in);

	public void run()
	{
		System.out.print("\n\n Enter Any Number:");
		num = Scan.nextInt();

		if(num % 2 == 0)
			System.out.println("\n\n Number is Even");

		else
			System.out.println("\n\n Number is Odd");		
	}
}

class RunnableDemo
{
	public static void main(String args[])
	{
		EvenOdd E = new EvenOdd();
		Thread T = new Thread(E);
		T.start();
	}
}