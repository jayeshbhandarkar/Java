/* WAP to demonstrate Heirarchical Inheritance by using Interface in Java */

interface A
{
	void display1();
}

class B implements A
{
	public void display1()
	{
		System.out.println("\n\n Display of Interface A: ");
	}

	void display2()
	{
		System.out.println("\n\n Display of Class B: ");
	}
}

class C implements A
{
	public void display1()
	{
		System.out.println("\n\n Display of Interface A: ");	
	}

	void display3()
	{
		System.out.println("\n\n Display of Class C: ");
	}
}

class HeirarchicalDemo
{
	public static void main(String args[])
	{
		B obj1 = new B();
		C obj2 = new C();

		System.out.println("\n\n Demonstration of Heirarchical Inheritance");

		obj1.display1();
		obj1.display2();

		obj2.display1();
		obj2.display3();
	}
}