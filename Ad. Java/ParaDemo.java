/* WAP to demonstrate Parameterised Constructor in Java */

class ParaDemo
{
	int x, y;

	ParaDemo(int a, int b)
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
		ParaDemo D;
		D = new ParaDemo(10,20);

		System.out.print("\n\n Object D");
		D.display();
	}
}