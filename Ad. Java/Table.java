/* WAP to print the table of the given No. Accept the number as Command Line 
   Arguments. */

class Table
{
	public static void main(String args[])
	{
		int i, num;
		num=Integer.parseInt(args[0]);

		for(i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
}