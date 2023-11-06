/* WAP to find the Sum of 1 to 10 Numbers. */

class Total
{
	public static void main(String args[])
	{
		int i, sum=0;
		
		//Find Sum of 1-10
		for(i=1;i<=10;i++)
		{
			sum = sum+i;
		}

		//Display Sum
		System.out.println("\n\n Sum of 1-10 is "+sum);
	}
}