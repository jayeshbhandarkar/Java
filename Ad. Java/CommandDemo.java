/* WAP to accept 2 numbers as command line arguments and find their Sum */

class CommandDemo
{
	public static void main(String args[])
	{
		int a,b,sum;
		
		//Accepting 2 Nos from Command Line
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);

		//Find Sum
		sum=a+b;

		//Display
		System.out.println("\n\n Sum = "+sum);
	}
}