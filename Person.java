/* WAP to create a class person having data members as Name and Age. Accept Information 
   2 Persons and Display it */

class Person
{
	String name;
	int age;

	void accept(String n,int a)
	{
		name = n;
		age  = a;
	}

	void display()
	{
		System.out.print("\n\n Name = "+name);
		System.out.print("\n\n Age  = "+age );
	}

	public static void main(String args[])
	{
		// Person-1
		Person P1 = new Person();
		P1.accept("ABC",16);
		P1.display();

		// Person-2
		Person P2 = new Person();
		P2.accept("XYZ",20);
		P2.display();
	}
}
