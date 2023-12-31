/* WAP to demonstrate Hybrid Inheritance by using Interface in Java */

interface A
{
	void display1();
}

interface B extends A
{
	void display2();
}

interface C extends A
{
	void display3();
}

class D implements B,c
{
	public void display1()
	{
		System.out.println("\n\n Display of Interface A:");
	}

	public void display2()
	{
		System.out.println("\n\n Display of ‌Interface B:");
	}

	public void display3()
	{
		System.out.println("\n\n Display of Interface C:");
	}

	void display4()
	{
		System.out.println("\n\n Display of Class D:");
	}
}

class HybridDemo
{
	public static void main(String args[])
	{
		D obj = new D();

		System.out.println("\n\n Demonstration of Hbrid Inheritance:");

		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}
}