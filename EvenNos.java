/* WAP to print all the Even Nos. from 1 to n. Accept 'n' as Command Line 
   Arguments. */

class EvenNos
{
	public static void main(String args[])
	{
		int i,n;
		n=Integer.parseInt(args[0]);
		System.out.println("\n\nEven Numbers from 1 to"+n+" are:");

		for(i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.println(" "+i);
		}
	}
}