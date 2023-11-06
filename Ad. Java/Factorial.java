/* WAP to find the factorial of the given No. Accept the number as Command 
   Line Arguments. */

class Factorial
{
	public static void main(String args[])
	{
		int num, i=1;
		long fact =1;
		num=Integer.parseInt(args[0]);
		
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}

		System.out.println("\n\nFactorial = "+fact);
	}
}