/* WAP to demonstrate Parameterised Constructor in Java */

class ParaDemoo
{
	int x, y;

	ParaDemoo(int a, int b)
	{
		x = a;
		y = b;
	}

	void display()
	{
		System.out.print("\n\n X = "+x);
		System.out.print("\n\n Y = "+y);
	}

	public static void main(String args[])
	{
		ParaDemoo D;
		D = new ParaDemoo(10,20);

		System.out.print("\n\n Object D");
		D.display();
	}
}