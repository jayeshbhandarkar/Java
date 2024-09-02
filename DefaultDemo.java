/* WAP to demonstrate Default Constructor in Java */

class DefaultDemo
{
	int x, y;

	DefaultDemo()
	{
		x = 10;
		y = 20;
	}

	void display()
	{
		System.out.print("\n\n X = "+x);
		System.out.print("\n\n Y = "+y);
	}

	public static void main(String args[])
	{
		DefaultDemo D;
		D = new DefaultDemo();

		System.out.print("\n\n Object D");
		D.display();
	}
}