/* WAP to demonstrate Arrays in Java (Compile Time Data) */

class Array
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		System.out.print("\n\n Initialization");

		for(int i=0; i<5; i++)
		{
			a[i]=i;
		}
		System.out.print("\n\n Display");

		for(int i=0; i<5; i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}